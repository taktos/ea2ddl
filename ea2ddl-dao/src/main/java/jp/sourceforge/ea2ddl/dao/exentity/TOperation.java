package jp.sourceforge.ea2ddl.dao.exentity;

import java.util.List;

/**
 * The entity of t_operation.
 * <p>
 * You can implement your original methods here.
 * This class is NOT overrided when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TOperation extends jp.sourceforge.ea2ddl.dao.bsentity.BsTOperation {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    
    private List<TOperationparams> _tOperationparamsList;

	public List<TOperationparams> getTOperationparamsList() {
		return _tOperationparamsList;
	}

	public void setTOperationparamsList(List<TOperationparams> operationparamsList) {
		_tOperationparamsList = operationparamsList;
	}
}
