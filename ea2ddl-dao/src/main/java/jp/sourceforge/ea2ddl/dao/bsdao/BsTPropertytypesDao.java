package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TPropertytypes;
import jp.sourceforge.ea2ddl.dao.cbean.TPropertytypesCB;

/**
 * The DAO interface of t_propertytypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTPropertytypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TPropertytypes.class; // For S2Dao

    public int selectCount(TPropertytypesCB cb);
    public List<TPropertytypes> selectList(TPropertytypesCB cb);

}
