package jp.sourceforge.ea2ddl.dao.allcommon.helper.stacktrace;

/**
 * @author DBFlute(AutoGenerator)
 */
public interface InvokeNameExtractor {

    /**
     * @param resource the call-back resource for invoke-name-extracting. (NotNull)
     * @return The result of invoke name. (NotNull: If not found, returns empty string.)
     */
    public InvokeNameResult extractInvokeName(InvokeNameExtractingResource resource);
}