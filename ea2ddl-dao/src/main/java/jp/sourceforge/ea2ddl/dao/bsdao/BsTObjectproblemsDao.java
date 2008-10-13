package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TObjectproblems;
import jp.sourceforge.ea2ddl.dao.cbean.TObjectproblemsCB;

/**
 * The DAO interface of t_objectproblems.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTObjectproblemsDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TObjectproblems.class; // For S2Dao

    public int selectCount(TObjectproblemsCB cb);
    public List<TObjectproblems> selectList(TObjectproblemsCB cb);

}
