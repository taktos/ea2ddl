package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TScenariotypes;
import jp.sourceforge.ea2ddl.dao.cbean.TScenariotypesCB;

/**
 * The DAO interface of t_scenariotypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTScenariotypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TScenariotypes.class; // For S2Dao

    public int selectCount(TScenariotypesCB cb);
    public List<TScenariotypes> selectList(TScenariotypesCB cb);

}
