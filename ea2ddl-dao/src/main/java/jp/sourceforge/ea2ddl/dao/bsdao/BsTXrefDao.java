package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TXref;
import jp.sourceforge.ea2ddl.dao.cbean.TXrefCB;

/**
 * The DAO interface of t_xref.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTXrefDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TXref.class; // For S2Dao

    public int selectCount(TXrefCB cb);
    public List<TXref> selectList(TXrefCB cb);

}
