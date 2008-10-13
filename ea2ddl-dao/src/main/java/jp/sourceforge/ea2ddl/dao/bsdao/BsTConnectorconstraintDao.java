package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TConnectorconstraint;
import jp.sourceforge.ea2ddl.dao.cbean.TConnectorconstraintCB;

/**
 * The DAO interface of t_connectorconstraint.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTConnectorconstraintDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TConnectorconstraint.class; // For S2Dao

    public int selectCount(TConnectorconstraintCB cb);
    public List<TConnectorconstraint> selectList(TConnectorconstraintCB cb);

}
