/**
 * 
 */
package jp.sourceforge.ea2ddl.ddl.command;

import java.io.File;

import jp.sourceforge.ea2ddl.ddl.model.Model;

import org.seasar.extension.jdbc.gen.generator.GenerationContext;
import org.seasar.extension.jdbc.gen.generator.Generator;
import org.seasar.extension.jdbc.gen.internal.generator.GenerationContextImpl;
import org.seasar.extension.jdbc.gen.internal.generator.GeneratorImpl;
import org.seasar.framework.log.Logger;

/**
 * @author taktos
 * 
 */
public class GenerateClassificationCommand extends TemplateCommand {
	private Logger _logger = Logger.getLogger(GenerateClassificationCommand.class);

	/*
	 * (非 Javadoc)
	 * 
	 * @see
	 * org.seasar.extension.jdbc.gen.internal.command.AbstractCommand#doDestroy
	 * ()
	 */
	@Override
	protected void doDestroy() {
	}

	/*
	 * (非 Javadoc)
	 * 
	 * @see
	 * org.seasar.extension.jdbc.gen.internal.command.AbstractCommand#doInit()
	 */
	@Override
	protected void doInit() {
	}

	/*
	 * (非 Javadoc)
	 * 
	 * @see
	 * org.seasar.extension.jdbc.gen.internal.command.AbstractCommand#doValidate
	 * ()
	 */
	@Override
	protected void doValidate() {
	}

	/*
	 * (非 Javadoc)
	 * 
	 * @see
	 * org.seasar.extension.jdbc.gen.internal.command.AbstractCommand#getLogger
	 * ()
	 */
	@Override
	protected Logger getLogger() {
		return _logger;
	}

	@Override
	protected GenerationContext createGenerationContext(Model model) {
		final File output = new File(getOutputDirName(), getOutputFileName());
		final GenerationContextImpl generationContext = new GenerationContextImpl(model, output,
				getTemplateFileName(), getOutputFileEncoding(), true);
		return generationContext;
	}

	@Override
	protected Generator createGenerator() {
		final File dir = new File(getTemplateFileDir());
		return new GeneratorImpl(getTemplateFileEncoding(), dir);
	}

}
