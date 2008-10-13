package jp.sourceforge.ea2ddl.dao.allcommon.exception;

/**
 * The exception of when the required option is not found.
 * @author DBFlute(AutoGenerator)
 */
public class RequiredOptionNotFoundException extends RuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * @param msg Exception message.
     */
    public RequiredOptionNotFoundException(String msg) {
        super(msg);
    }

    /**
     * Constructor.
     * @param msg Exception message.
     * @param cause Throwable.
     */
    public RequiredOptionNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
