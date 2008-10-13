package jp.sourceforge.ea2ddl.dao.allcommon.util;

/**
 * @author DBFlute(AutoGenerator)
 */
public class SimpleSystemUtil {

    // ===================================================================================
    //                                                                              System
    //                                                                              ======
    public static String getLineSeparator() {
        // /- - - - - - - - - - - - - - - - - - - - - -
        // Because 'CR + LF' caused many trouble!
		// And Now 'LF' have little trouble. 
		// 
        // return System.getProperty("line.separator");
        // - - - - - - - - - -/
		return "\n";
    }
}
