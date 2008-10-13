package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TTesttypes;
import jp.sourceforge.ea2ddl.dao.cbean.TTesttypesCB;

/**
 * The DAO interface of t_testtypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTTesttypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TTesttypes.class; // For S2Dao

    public int selectCount(TTesttypesCB cb);
    public List<TTesttypes> selectList(TTesttypesCB cb);

}
