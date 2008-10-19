/**
 * 
 */
package jp.sourceforge.ea2ddl.ddl.command;

import java.io.File;

import jp.sourceforge.ea2ddl.ddl.factory.DatabaseModelFactory;
import jp.sourceforge.ea2ddl.ddl.model.DatabaseModel;

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
public class GenerateDdlCommand extends AbstractCommand {
	protected Logger _logger = Logger.getLogger(GenerateDdlCommand.class);

	protected String _factoryClassName;

	public String getFactoryClassName() {
		return _factoryClassName;
	}

	public void setFactoryClassName(String generatorClassName) {
		_factoryClassName = generatorClassName;
	}

	/*
	 * (”ñ Javadoc)
	 * 
	 * @see
	 * org.seasar.extension.jdbc.gen.internal.command.AbstractCommand#doValidate
	 * ()
	 */
	@Override
	protected void doValidate() {
	}

	/*
	 * (”ñ Javadoc)
	 * 
	 * @see
	 * org.seasar.extension.jdbc.gen.internal.command.AbstractCommand#doInit()
	 */
	@Override
	protected void doInit() {
	}

	/*
	 * (”ñ Javadoc)
	 * 
	 * @see
	 * org.seasar.extension.jdbc.gen.internal.command.AbstractCommand#doExecute
	 * ()
	 */
	@Override
	protected void doExecute() throws Throwable {
		DatabaseModelFactory factory = (DatabaseModelFactory) SingletonS2Container
				.getComponent(ClassUtil.convertClass(_factoryClassName));
		final DatabaseModel dbModel = factory.create();
		generate(dbModel);
	}

	protected void generate(DatabaseModel model) {
		final File templateDir = new File("target/classes");
		final Generator generator = new GeneratorImpl("UTF-8", templateDir);
		File output = new File("base.sql");
		final GenerationContext context = new GenerationContextImpl(model,
				output, "base.ftl", "UTF-8", true);
		generator.generate(context);
	}

	/*
	 * (”ñ Javadoc)
	 * 
	 * @see
	 * org.seasar.extension.jdbc.gen.internal.command.AbstractCommand#doDestroy
	 * ()
	 */
	@Override
	protected void doDestroy() {
	}

	/*
	 * (”ñ Javadoc)
	 * 
	 * @see
	 * org.seasar.extension.jdbc.gen.internal.command.AbstractCommand#getLogger
	 * ()
	 */
	@Override
	protected Logger getLogger() {
		return _logger;
	}

}
