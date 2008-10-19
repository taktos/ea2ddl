/**
 * 
 */
package jp.sourceforge.ea2ddl.ddl.task;

import jp.sourceforge.ea2ddl.ddl.command.GenerateDdlCommand;

import org.seasar.extension.jdbc.gen.command.Command;
import org.seasar.extension.jdbc.gen.task.AbstractTask;

/**
 * @author taktos
 * 
 */
public class GenerateDdlTask extends AbstractTask {
	protected GenerateDdlCommand _command = new GenerateDdlCommand();

	/*
	 * (”ñ Javadoc)
	 * 
	 * @see org.seasar.extension.jdbc.gen.task.AbstractTask#getCommand()
	 */
	@Override
	protected Command getCommand() {
		return _command;
	}

	public void setConfigPath(String configPath) {
		_command.setConfigPath(configPath);
	}

	public void setFactoryClassName(String className) {
		_command.setFactoryClassName(className);
	}
}
