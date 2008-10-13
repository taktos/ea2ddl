package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TDatatypes;
import jp.sourceforge.ea2ddl.dao.cbean.TDatatypesCB;

/**
 * The DAO interface of t_datatypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTDatatypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TDatatypes.class; // For S2Dao

    public int selectCount(TDatatypesCB cb);
    public List<TDatatypes> selectList(TDatatypesCB cb);

}
