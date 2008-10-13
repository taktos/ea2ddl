package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TXrefuser;
import jp.sourceforge.ea2ddl.dao.cbean.TXrefuserCB;

/**
 * The DAO interface of t_xrefuser.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTXrefuserDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TXrefuser.class; // For S2Dao

    public int selectCount(TXrefuserCB cb);
    public List<TXrefuser> selectList(TXrefuserCB cb);

}
