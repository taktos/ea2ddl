package jp.sourceforge.ea2ddl.comment.task;

import jp.sourceforge.ea2ddl.comment.command.GenerateCommentCommand;

import org.seasar.extension.jdbc.gen.command.Command;
import org.seasar.extension.jdbc.gen.task.AbstractTask;

public class GenerateCommentTask2 extends AbstractTask {

	protected GenerateCommentCommand command = new GenerateCommentCommand();

	public void setOutputDirectory(String outputDirectory) {
		command.setOutputDirectory(outputDirectory);
	}

	public void setConfigPath(String configPath) {
		command.setConfigPath(configPath);
	}

	@Override
	protected Command getCommand() {
		return command;
	}

}
