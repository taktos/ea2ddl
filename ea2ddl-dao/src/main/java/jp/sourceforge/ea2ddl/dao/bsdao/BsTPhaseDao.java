package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TPhase;
import jp.sourceforge.ea2ddl.dao.cbean.TPhaseCB;

/**
 * The DAO interface of t_phase.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTPhaseDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TPhase.class; // For S2Dao

    public int selectCount(TPhaseCB cb);
    public List<TPhase> selectList(TPhaseCB cb);

}
