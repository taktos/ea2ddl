package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TSeclocks;
import jp.sourceforge.ea2ddl.dao.cbean.TSeclocksCB;

/**
 * The DAO interface of t_seclocks.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTSeclocksDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TSeclocks.class; // For S2Dao

    public int selectCount(TSeclocksCB cb);
    public List<TSeclocks> selectList(TSeclocksCB cb);

}
