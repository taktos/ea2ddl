package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TObjectscenarios;
import jp.sourceforge.ea2ddl.dao.cbean.TObjectscenariosCB;

/**
 * The DAO interface of t_objectscenarios.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTObjectscenariosDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TObjectscenarios.class; // For S2Dao

    public int selectCount(TObjectscenariosCB cb);
    public List<TObjectscenarios> selectList(TObjectscenariosCB cb);

}
