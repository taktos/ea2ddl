package jp.sourceforge.ea2ddl.comment.command.impl;

import jp.sourceforge.ea2ddl.comment.command.Command;

public class GenerateCommentCommand implements Command {

	private String _outputDirectory;
	
	public void setOutputDirectory(String outputDirectory) {
		_outputDirectory = outputDirectory;
	}

	@Override
	public void execute() {
		System.out.println(_outputDirectory);
	}

}
