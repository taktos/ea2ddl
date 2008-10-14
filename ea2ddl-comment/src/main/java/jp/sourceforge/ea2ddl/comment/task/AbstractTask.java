/**
 * 
 */
package jp.sourceforge.ea2ddl.comment.task;

import jp.sourceforge.ea2ddl.comment.command.Command;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

/**
 * @author taktos
 *
 */
public abstract class AbstractTask<T extends Command> extends Task {

	protected String configPath = "ea2ddl.dicon";

	@Override
	public void init() throws BuildException {
		SingletonS2ContainerFactory.setConfigPath(configPath);
		SingletonS2ContainerFactory.init();
	}

	@Override
	public void execute() throws BuildException {
		getCommand().execute();
	}

	protected abstract Class<T> getCommandClass();

	@SuppressWarnings("unchecked")
	protected T getCommand() {
		return (T) SingletonS2ContainerFactory.getContainer().getComponent(getCommandClass());
	}
	
}
