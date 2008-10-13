package jp.sourceforge.ea2ddl.dao.allcommon.exception;

/**
 * The exception when the record has overlapped.
 * This class is old.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class RecordHasOverlappedException extends RuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * 
     * @param msg Exception message.
     */
    public RecordHasOverlappedException(String msg) {
        super(msg);
    }

    /**
     * Constructor.
     * 
     * @param msg Exception message.
     * @param cause Throwable.
     */
    public RecordHasOverlappedException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
