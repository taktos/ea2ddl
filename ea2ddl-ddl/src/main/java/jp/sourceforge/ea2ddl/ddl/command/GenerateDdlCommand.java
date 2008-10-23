/**
 * 
 */
package jp.sourceforge.ea2ddl.ddl.command;

import java.io.File;

import jp.sourceforge.ea2ddl.ddl.factory.ModelFactory;
import jp.sourceforge.ea2ddl.ddl.model.Model;

import org.seasar.extension.jdbc.gen.generator.GenerationContext;
import org.seasar.extension.jdbc.gen.generator.Generator;
import org.seasar.extension.jdbc.gen.internal.command.AbstractCommand;
import org.seasar.extension.jdbc.gen.internal.generator.GenerationContextImpl;
import org.seasar.extension.jdbc.gen.internal.generator.GeneratorImpl;
import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.log.Logger;
import org.seasar.framework.util.ClassUtil;

/**
 * @author taktos
 * 
 */
public class GenerateDdlCommand extends AbstractCommand {
	protected Logger _logger = Logger.getLogger(GenerateDdlCommand.class);

	protected String _factoryClassName;
	protected String _templateFileDir = "target/classes";
	protected String _templateFileEncoding = "UTF-8";
	protected String _sqlFileEncoding = "UTF-8";
	protected String _outputDirName = "output";
	protected String _baseSqlFileName = "replace-schema-10-base.sql";
	protected String _baseSqlTemplateFileName = "base.ftl";

	public String getFactoryClassName() {
		return _factoryClassName;
	}

	public void setFactoryClassName(String factoryClassName) {
		_factoryClassName = factoryClassName;
	}

	public String getTemplateFileDir() {
		return _templateFileDir;
	}

	public void setTemplateFileDir(String templateFileDir) {
		_templateFileDir = templateFileDir;
	}

	public String getTemplateFileEncoding() {
		return _templateFileEncoding;
	}

	public void setTemplateFileEncoding(String templateFileEncoding) {
		_templateFileEncoding = templateFileEncoding;
	}

	public String getSqlFileEncoding() {
		return _sqlFileEncoding;
	}

	public void setSqlFileEncoding(String sqlFileEncoding) {
		_sqlFileEncoding = sqlFileEncoding;
	}

	public String getOutputDirName() {
		return _outputDirName;
	}

	public void setOutputDirName(String outputDirName) {
		_outputDirName = outputDirName;
	}

	public String getBaseSqlFileName() {
		return _baseSqlFileName;
	}

	public void setBaseSqlFileName(String baseSqlFileName) {
		_baseSqlFileName = baseSqlFileName;
	}

	public String getBaseSqlTemplateFileName() {
		return _baseSqlTemplateFileName;
	}

	public void setBaseSqlTemplateFileName(String baseSqlTemplateFileName) {
		_baseSqlTemplateFileName = baseSqlTemplateFileName;
	}

	/*
	 * (�� Javadoc)
	 * 
	 * @see
	 * org.seasar.extension.jdbc.gen.internal.command.AbstractCommand#doValidate
	 * ()
	 */
	@Override
	protected void doValidate() {
	}

	/*
	 * (�� Javadoc)
	 * 
	 * @see
	 * org.seasar.extension.jdbc.gen.internal.command.AbstractCommand#doInit()
	 */
	@Override
	protected void doInit() {
	}

	/*
	 * (�� Javadoc)
	 * 
	 * @see
	 * org.seasar.extension.jdbc.gen.internal.command.AbstractCommand#doExecute
	 * ()
	 */
	@Override
	protected void doExecute() throws Throwable {
		ModelFactory modelFactory = (ModelFactory) SingletonS2Container.getComponent(ClassUtil
				.convertClass(_factoryClassName));
		final Model dbModel = modelFactory.create();
		generate(dbModel);
	}

	protected void generate(Model model) {
		final File templateDir = new File(_templateFileDir);
		final Generator generator = new GeneratorImpl(_templateFileEncoding, templateDir);
		File output = new File(_outputDirName, _baseSqlFileName);
		final GenerationContext context = new GenerationContextImpl(model, output, _baseSqlTemplateFileName,
				_sqlFileEncoding, true);
		generator.generate(context);
	}

	/*
	 * (�� Javadoc)
	 * 
	 * @see
	 * org.seasar.extension.jdbc.gen.internal.command.AbstractCommand#doDestroy
	 * ()
	 */
	@Override
	protected void doDestroy() {
	}

	/*
	 * (�� Javadoc)
	 * 
	 * @see
	 * org.seasar.extension.jdbc.gen.internal.command.AbstractCommand#getLogger
	 * ()
	 */
	@Override
	protected Logger getLogger() {
		return _logger;
	}

}
