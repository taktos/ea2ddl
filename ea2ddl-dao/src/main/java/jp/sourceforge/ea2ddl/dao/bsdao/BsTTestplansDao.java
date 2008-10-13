package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TTestplans;
import jp.sourceforge.ea2ddl.dao.cbean.TTestplansCB;

/**
 * The DAO interface of t_testplans.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTTestplansDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TTestplans.class; // For S2Dao

    public int selectCount(TTestplansCB cb);
    public List<TTestplans> selectList(TTestplansCB cb);

}
