package jp.sourceforge.ea2ddl.comment.command.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;

import jp.sourceforge.ea2ddl.comment.command.Command;
import jp.sourceforge.ea2ddl.common.config.Config;
import jp.sourceforge.ea2ddl.dao.exbhv.TAttributeBhv;
import jp.sourceforge.ea2ddl.dao.exbhv.TObjectBhv;
import jp.sourceforge.ea2ddl.dao.exbhv.TPackageBhv;
import jp.sourceforge.ea2ddl.dao.exentity.TAttribute;
import jp.sourceforge.ea2ddl.dao.exentity.TObject;
import jp.sourceforge.ea2ddl.dao.exentity.TPackage;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.framework.container.annotation.tiger.Binding;

public class GenerateCommentCommand implements Command {
	private static final Log _log = LogFactory.getLog(GenerateCommentCommand.class);
	private String _outputDirectory;

	private Config _config;
	private TPackageBhv _packageBhv;
	private TObjectBhv _objectBhv;
	private TAttributeBhv _attributeBhv;

	@Binding
	public void setConfig(Config config) {
		_config = config;
	}

	public void setTPackageBhv(TPackageBhv packageBhv) {
		_packageBhv = packageBhv;
	}

	public void setTObjectBhv(TObjectBhv objectBhv) {
		_objectBhv = objectBhv;
	}

	public void setTAttributeBhv(TAttributeBhv attributeBhv) {
		_attributeBhv = attributeBhv;
	}

	public void setOutputDirectory(String outputDirectory) {
		_outputDirectory = outputDirectory;
	}

	public void execute() {
		Writer writer = null;
		try {
			writer = createWriter();
			generateTableComment(writer);
		} catch (IOException e) {
			_log.error("Failed to write", e);
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
				}
			}
		}
	}

	protected Writer createWriter() throws IOException {
		final File dir = new File(_outputDirectory);
		_log.info(dir.getAbsolutePath());
		if (!dir.exists()) {
			dir.mkdirs();
		}
		final File file = new File(dir, "replace-schema-90-comment.sql");
		return new OutputStreamWriter(new FileOutputStream(file));
	}

	protected void generateTableComment(Writer writer) throws IOException {
		final TPackage pkg = _packageBhv.selectPackage(_config.getProperty("er.package.path"));
		final List<TObject> tables = _objectBhv.selectListByStereotype(pkg, "table");
		for (TObject table : tables) {
			writeTableCommentLine(table, writer);
			generateColumnComment(table, writer);
		}
	}

	protected void writeTableCommentLine(TObject table, Writer writer) throws IOException {
		if (StringUtils.isBlank(table.getAlias()) && StringUtils.isBlank(table.getNote())) {
			return;
		}
		StringBuffer b = new StringBuffer();
		b.append("COMMENT ON TABLE ").append(table.getName()).append(" IS '");
		if (StringUtils.isNotBlank(table.getAlias())) {
			b.append(table.getAlias()).append(_config.getProperty("token.char", ".")).append("\r\n");
		}
		if (StringUtils.isNotBlank(table.getNote())) {
			b.append(table.getNote());
		}
		b.append("';\r\n");
		writer.write(b.toString());
	}

	protected void generateColumnComment(TObject table, Writer writer) throws IOException {
		final List<TAttribute> columns = _attributeBhv.selectColumns(table);
		for (TAttribute column : columns) {
			writeColumnCommentLine(table, column, writer);
		}
	}

	protected void writeColumnCommentLine(TObject table, TAttribute column, Writer writer) throws IOException {
		if (StringUtils.isBlank(column.getStyle()) && StringUtils.isBlank(column.getNotes())) {
			return;
		}
		final StringBuffer b = new StringBuffer();
		b.append("COMMENT ON COLUMN ").append(table.getName()).append(".").append(column.getName()).append(" IS '");
		if (StringUtils.isNotBlank(column.getStyle())) {
			b.append(column.getStyle()).append(_config.getProperty("token.char", ".")).append("\r\n");
		}
		if (StringUtils.isNotBlank(column.getNotes())) {
			b.append(column.getNotes());
		}
		b.append("';\r\n");
		writer.write(b.toString());
	}
}
