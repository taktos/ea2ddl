/**
 * 
 */
package jp.sourceforge.ea2ddl.comment.task;

import jp.sourceforge.ea2ddl.comment.command.impl.GenerateCommentCommand;

/**
 * @author taktos
 * 
 */
public class GenerateCommentTask extends AbstractTask<GenerateCommentCommand> {

	@Override
	protected Class<GenerateCommentCommand> getCommandClass() {
		return GenerateCommentCommand.class;
	}

	public void setOutputDirectory(String outputDirectory) {
		System.out.println("SETTER");
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getContextClassLoader());
		getCommand().setOutputDirectory(outputDirectory);
	}
}
