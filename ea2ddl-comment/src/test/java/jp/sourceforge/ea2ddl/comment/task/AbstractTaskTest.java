package jp.sourceforge.ea2ddl.comment.task;

import static org.junit.Assert.assertNotNull;
import jp.sourceforge.ea2ddl.comment.command.impl.GenerateCommentCommand;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.framework.unit.Seasar2;
import org.seasar.framework.unit.annotation.RootDicon;

@RunWith(Seasar2.class)
@RootDicon("app.dicon")
public class AbstractTaskTest {

	GenerateCommentCommand command;

	@Test
	public void testInit() {
		command.setOutputDirectory("/project/ea2ddl/ea2ddl-gen/dbflute/playsql");
		assertNotNull(command);
		command.execute();
	}
}
