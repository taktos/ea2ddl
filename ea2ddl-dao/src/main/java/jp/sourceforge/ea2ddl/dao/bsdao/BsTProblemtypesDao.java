package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TProblemtypes;
import jp.sourceforge.ea2ddl.dao.cbean.TProblemtypesCB;

/**
 * The DAO interface of t_problemtypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTProblemtypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TProblemtypes.class; // For S2Dao

    public int selectCount(TProblemtypesCB cb);
    public List<TProblemtypes> selectList(TProblemtypesCB cb);

}
