/**
 * 
 */
package jp.sourceforge.ea2ddl.ddl.command;

import java.io.File;

import jp.sourceforge.ea2ddl.ddl.factory.ModelFactory;
import jp.sourceforge.ea2ddl.ddl.model.Model;

import org.seasar.extension.jdbc.gen.generator.GenerationContext;
import org.seasar.extension.jdbc.gen.generator.Generator;
import org.seasar.extension.jdbc.gen.internal.command.AbstractCommand;
import org.seasar.extension.jdbc.gen.internal.generator.GenerationContextImpl;
import org.seasar.extension.jdbc.gen.internal.generator.GeneratorImpl;
import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.log.Logger;
import org.seasar.framework.util.ClassUtil;

/**
 * @author taktos
 * 
 */
public class TemplateCommand extends AbstractCommand {
	private Logger _logger = Logger.getLogger(TemplateCommand.class);

	protected String _factoryClassName;
	protected String _templateFileDir = "target/classes";
	protected String _templateFileName;
	protected String _templateFileEncoding = "UTF-8";
	protected String _outputDirName = "output";
	protected String _outputFileName;
	protected String _outputFileEncoding = "UTF-8";

	public String getFactoryClassName() {
		return _factoryClassName;
	}

	public void setFactoryClassName(String factoryClassName) {
		_factoryClassName = factoryClassName;
	}

	public String getTemplateFileDir() {
		return _templateFileDir;
	}

	public void setTemplateFileDir(String templateFileDir) {
		_templateFileDir = templateFileDir;
	}

	public String getTemplateFileEncoding() {
		return _templateFileEncoding;
	}

	public void setTemplateFileEncoding(String templateFileEncoding) {
		_templateFileEncoding = templateFileEncoding;
	}

	public String getOutputDirName() {
		return _outputDirName;
	}

	public void setOutputDirName(String outputDirName) {
		_outputDirName = outputDirName;
	}

	public String getOutputFileName() {
		return _outputFileName;
	}

	public void setOutputFileName(String outputFileName) {
		_outputFileName = outputFileName;
	}

	public String getOutputFileEncoding() {
		return _outputFileEncoding;
	}

	public void setOutputFileEncoding(String outputFileEncoding) {
		_outputFileEncoding = outputFileEncoding;
	}

	public String getTemplateFileName() {
		return _templateFileName;
	}

	public void setTemplateFileName(String outputTemplateFileName) {
		_templateFileName = outputTemplateFileName;
	}

	@Override
	protected void doInit() {
	}

	@Override
	protected void doValidate() {
	}

	@Override
	protected void doExecute() throws Throwable {
		final ModelFactory modelFactory = (ModelFactory) SingletonS2Container.getComponent(ClassUtil
				.convertClass(getFactoryClassName()));
		final Model model = modelFactory.create();
		createGenerator().generate(createGenerationContext(model));
	}

	@Override
	protected void doDestroy() {
	}

	@Override
	protected Logger getLogger() {
		return _logger;
	}

	protected Generator createGenerator() {
		final File dir = new File(getTemplateFileDir());
		return new GeneratorImpl(getTemplateFileEncoding(), dir);
	}

	protected GenerationContext createGenerationContext(Model model) {
		final File output = new File(getOutputDirName(), getOutputFileName());
		final GenerationContextImpl generationContext = new GenerationContextImpl(model, output, getTemplateFileName(),
				getOutputFileEncoding(), true);
		return generationContext;
	}
}
