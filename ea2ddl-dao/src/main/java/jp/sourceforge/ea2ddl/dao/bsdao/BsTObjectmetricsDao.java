package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TObjectmetrics;
import jp.sourceforge.ea2ddl.dao.cbean.TObjectmetricsCB;

/**
 * The DAO interface of t_objectmetrics.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTObjectmetricsDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TObjectmetrics.class; // For S2Dao

    public int selectCount(TObjectmetricsCB cb);
    public List<TObjectmetrics> selectList(TObjectmetricsCB cb);

}
