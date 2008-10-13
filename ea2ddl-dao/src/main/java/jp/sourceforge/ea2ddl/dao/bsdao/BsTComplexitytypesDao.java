package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TComplexitytypes;
import jp.sourceforge.ea2ddl.dao.cbean.TComplexitytypesCB;

/**
 * The DAO interface of t_complexitytypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTComplexitytypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TComplexitytypes.class; // For S2Dao

    public int selectCount(TComplexitytypesCB cb);
    public List<TComplexitytypes> selectList(TComplexitytypesCB cb);

}
