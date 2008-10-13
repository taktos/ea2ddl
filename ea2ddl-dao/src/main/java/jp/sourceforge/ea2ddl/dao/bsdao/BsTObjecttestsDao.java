package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TObjecttests;
import jp.sourceforge.ea2ddl.dao.cbean.TObjecttestsCB;

/**
 * The DAO interface of t_objecttests.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTObjecttestsDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TObjecttests.class; // For S2Dao

    public int selectCount(TObjecttestsCB cb);
    public List<TObjecttests> selectList(TObjecttestsCB cb);

}
