package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TObjecttypes;
import jp.sourceforge.ea2ddl.dao.cbean.TObjecttypesCB;

/**
 * The DAO interface of t_objecttypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTObjecttypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TObjecttypes.class; // For S2Dao

    public int selectCount(TObjecttypesCB cb);
    public List<TObjecttypes> selectList(TObjecttypesCB cb);

}
