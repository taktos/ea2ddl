/**
 * 
 */
package jp.sourceforge.ea2ddl.ddl.task;

import jp.sourceforge.ea2ddl.ddl.command.TemplateCommand;

import org.seasar.extension.jdbc.gen.command.Command;
import org.seasar.extension.jdbc.gen.task.AbstractTask;

/**
 * @author taktos
 * 
 */
public abstract class TemplateTask extends AbstractTask {

	protected abstract TemplateCommand getTemplateCommand();

	@Override
	protected Command getCommand() {
		return getTemplateCommand();
	}

	public void setConfigPath(String configPath) {
		getTemplateCommand().setConfigPath(configPath);
	}

	public void setFactoryClassName(String className) {
		getTemplateCommand().setFactoryClassName(className);
	}

	public void setTemplateFileDir(String templateFileDir) {
		getTemplateCommand().setTemplateFileDir(templateFileDir);
	}

	public void setTemplateFileName(String templateFileName) {
		getTemplateCommand().setTemplateFileName(templateFileName);
	}

	public void setTemplateFileEncoding(String templateFileEncoding) {
		getTemplateCommand().setTemplateFileEncoding(templateFileEncoding);
	}

	public void setOutputDirName(String outputDirName) {
		getTemplateCommand().setOutputDirName(outputDirName);
	}

	public void setOutputFileName(String outputFileName) {
		getTemplateCommand().setOutputFileName(outputFileName);
	}

	public void setOutputFileEncoding(String outputFileEncoding) {
		getTemplateCommand().setOutputFileEncoding(outputFileEncoding);
	}

}
