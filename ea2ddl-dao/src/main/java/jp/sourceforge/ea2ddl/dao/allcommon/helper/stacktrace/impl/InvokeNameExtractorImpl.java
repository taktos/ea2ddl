package jp.sourceforge.ea2ddl.dao.allcommon.helper.stacktrace.impl;

import jp.sourceforge.ea2ddl.dao.allcommon.helper.stacktrace.InvokeNameResult;
import jp.sourceforge.ea2ddl.dao.allcommon.helper.stacktrace.InvokeNameExtractingResource;
import jp.sourceforge.ea2ddl.dao.allcommon.helper.stacktrace.InvokeNameExtractor;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InvokeNameExtractorImpl implements InvokeNameExtractor {

    // ==========================================================================================
    //                                                                                  Attribute
    //                                                                                  =========
    protected StackTraceElement[] _stackTrace;

    // ==========================================================================================
    //                                                                                       Main
    //                                                                                       ====
    /**
     * @param resource the call-back resource for invoke-name-extracting. (NotNull)
     * @return Invoke name. (NotNull: If not found, returns empty string.)
     */
    public InvokeNameResult extractInvokeName(InvokeNameExtractingResource resource) {
        if (_stackTrace == null) {
            String msg = "The attribute 'stackTrace' should not be null: resource=" + resource;
            throw new IllegalStateException(msg);
        }
        String targetSimpleClassName = null;
        String targetMethodName = null;
        int lineNumber = 0;
        int foundIndex = -1; // The minus one means 'Not Found'.
        int foundFirstIndex = -1; // The minus one means 'Not Found'.
        boolean onTarget = false;
        for (int i=resource.getStartIndex(); i < _stackTrace.length; i++) {
            final StackTraceElement element = _stackTrace[i];
            if (i > resource.getStartIndex() + resource.getLoopSize()) {
                break;
            }
            final String className = element.getClassName();
            if (className.startsWith("sun.") || className.startsWith("java.")) {
                if (onTarget) {
                    break;
                }
                continue;
            }
            final String methodName = element.getMethodName();
            if (resource.isTargetElement(className, methodName)) {
                if (methodName.equals("invoke")) {
                    continue;
                }
                targetSimpleClassName = className.substring(className.lastIndexOf(".") + 1);
                targetMethodName = methodName;
                if (resource.isUseAdditionalInfo()) {
                    lineNumber = element.getLineNumber();
                }
                foundIndex = i;
                if (foundFirstIndex == -1) {
                    foundFirstIndex = i;
                }
                onTarget = true;
                continue;
            }
            if (onTarget) {
                break;
            }
        }
        final InvokeNameResult result = new InvokeNameResult();
        if (targetSimpleClassName == null) {
            result.beEmptyResult(); // Not Found! It sets empty result.
            return result;
        }
        final String filteredClassName = resource.filterSimpleClassName(targetSimpleClassName);
        result.setSimpleClassName(resource.filterSimpleClassName(targetSimpleClassName));
        result.setMethodName(targetMethodName);
        if (lineNumber > 0) {
            result.setInvokeName(filteredClassName + "." + targetMethodName + "():" + lineNumber + " --> ");
        } else {
            result.setInvokeName(filteredClassName + "." + targetMethodName + "() --> ");
        }
        result.setFoundIndex(foundIndex);
        result.setFoundFirstIndex(foundFirstIndex);
        return result;
    }

    // ==========================================================================================
    //                                                                                   Accessor
    //                                                                                   ========
    public void setStackTrace(StackTraceElement[] stackTrace) {
        _stackTrace = stackTrace;
    }
}