package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TXrefsystem;
import jp.sourceforge.ea2ddl.dao.cbean.TXrefsystemCB;

/**
 * The DAO interface of t_xrefsystem.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTXrefsystemDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TXrefsystem.class; // For S2Dao

    public int selectCount(TXrefsystemCB cb);
    public List<TXrefsystem> selectList(TXrefsystemCB cb);

}
