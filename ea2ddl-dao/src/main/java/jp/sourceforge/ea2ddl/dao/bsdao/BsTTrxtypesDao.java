package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TTrxtypes;
import jp.sourceforge.ea2ddl.dao.cbean.TTrxtypesCB;

/**
 * The DAO interface of t_trxtypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTTrxtypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TTrxtypes.class; // For S2Dao

    public int selectCount(TTrxtypesCB cb);
    public List<TTrxtypes> selectList(TTrxtypesCB cb);

}
