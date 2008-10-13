package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TPrimitives;
import jp.sourceforge.ea2ddl.dao.cbean.TPrimitivesCB;

/**
 * The DAO interface of t_primitives.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTPrimitivesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TPrimitives.class; // For S2Dao

    public int selectCount(TPrimitivesCB cb);
    public List<TPrimitives> selectList(TPrimitivesCB cb);

}
