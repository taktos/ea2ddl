package jp.sourceforge.ea2ddl.comment.command;

import org.seasar.extension.jdbc.gen.internal.command.AbstractCommand;
import org.seasar.framework.log.Logger;

public class GenerateCommentCommand extends AbstractCommand {
	private Logger logger = Logger.getLogger(GenerateCommentCommand.class);

	protected String _outputDirectory;

	public String getOutputDirectory() {
		return _outputDirectory;
	}

	public void setOutputDirectory(String outputDirectory) {
		_outputDirectory = outputDirectory;
	}

	@Override
	protected void doValidate() {
	}

	@Override
	protected void doInit() {

	}

	@Override
	protected void doExecute() throws Throwable {
		getLogger().info(_outputDirectory);
	}

	@Override
	protected void doDestroy() {
	}

	@Override
	protected Logger getLogger() {
		return logger;
	}

}
