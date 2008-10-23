/**
 * 
 */
package jp.sourceforge.ea2ddl.ddl.task;

import jp.sourceforge.ea2ddl.ddl.command.GenerateClassificationCommand;
import jp.sourceforge.ea2ddl.ddl.command.TemplateCommand;

/**
 * @author taktos
 * 
 */
public class GenerateClassificationTask extends TemplateTask {

	protected GenerateClassificationCommand _command = new GenerateClassificationCommand();

	@Override
	protected TemplateCommand getTemplateCommand() {
		return _command;
	}

}
