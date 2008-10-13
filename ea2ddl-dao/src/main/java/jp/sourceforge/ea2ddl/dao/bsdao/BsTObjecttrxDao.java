package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TObjecttrx;
import jp.sourceforge.ea2ddl.dao.cbean.TObjecttrxCB;

/**
 * The DAO interface of t_objecttrx.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTObjecttrxDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TObjecttrx.class; // For S2Dao

    public int selectCount(TObjecttrxCB cb);
    public List<TObjecttrx> selectList(TObjecttrxCB cb);

}
