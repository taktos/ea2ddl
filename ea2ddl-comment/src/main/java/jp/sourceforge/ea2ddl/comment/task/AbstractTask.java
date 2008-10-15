/**
 * 
 */
package jp.sourceforge.ea2ddl.comment.task;

import jp.sourceforge.ea2ddl.comment.command.Command;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

/**
 * @author taktos
 * 
 */
public abstract class AbstractTask<T extends Command> extends Task {

	protected String configPath = "ea2ddl.dicon";
	private S2Container container;

	protected synchronized S2Container getContainer() {
		if (container == null) {
			S2ContainerFactory.create(configPath);
			Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
			SingletonS2ContainerFactory.setConfigPath(configPath);
			SingletonS2ContainerFactory.init();
			container = SingletonS2ContainerFactory.getContainer();
		}
		return container;
	}

	@Override
	public void init() throws BuildException {
		System.out.println("INIT");
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getContextClassLoader());
		System.out.println(Thread.currentThread().getContextClassLoader().getResource("ea2ddl.dicon"));
	}

	@Override
	public void execute() throws BuildException {
		System.out.println("EXECUTE");
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getContextClassLoader());
		getCommand().execute();

	}

	protected abstract Class<T> getCommandClass();

	@SuppressWarnings("unchecked")
	protected T getCommand() {
		return (T) getContainer().getComponent(getCommandClass());
	}

}
