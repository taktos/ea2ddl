package jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlparser;

import org.seasar.dao.CommandContext;
import org.seasar.dao.context.CommandContextImpl;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalCommandContextCreator {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected String[] argNames;
    protected Class<?>[] argTypes;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
	public InternalCommandContextCreator(String[] argNames, Class<?>[] argTypes) {
	    this.argNames = (argNames != null ? argNames : new String[0]);
	    this.argTypes = (argTypes != null ? argTypes : new Class[0]);
	}
	
    // ===================================================================================
    //                                                                              Create
    //                                                                              ======
	public CommandContext createCommandContext(Object[] args) {
        final CommandContext ctx = new CommandContextImpl();
        if (args != null) {
            for (int i = 0; i < args.length; ++i) {
                Class<?> argType = null;
                if (args[i] != null) {
                    if (i < argTypes.length) {
                        argType = argTypes[i];
                    } else if (args[i] != null) {
                        argType = args[i].getClass();
                    }
                }
                if (i < argNames.length) {
                    ctx.addArg(argNames[i], args[i], argType);
                } else {
                    ctx.addArg("$" + (i + 1), args[i], argType);
                }
            }
        }
        return ctx;
    }
}
