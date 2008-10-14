package jp.sourceforge.ea2ddl.comment.task;

import static org.junit.Assert.*;
import jp.sourceforge.ea2ddl.comment.command.impl.GenerateCommentCommand;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.framework.unit.Seasar2;
import org.seasar.framework.unit.annotation.RootDicon;


public class AbstractTaskTest {

	@Test
	public void testInit() {
		SampleTask task = new SampleTask();
		task.init();
		GenerateCommentCommand command = task.getCommand();
		assertNotNull(command);
		command.execute();
	}

	class SampleTask extends AbstractTask<GenerateCommentCommand> {
		@Override
		protected Class<GenerateCommentCommand> getCommandClass() {
			return GenerateCommentCommand.class;
		}
	}
}
