package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TRtfreport;
import jp.sourceforge.ea2ddl.dao.cbean.TRtfreportCB;

/**
 * The DAO interface of t_rtfreport.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTRtfreportDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TRtfreport.class; // For S2Dao

    public int selectCount(TRtfreportCB cb);
    public List<TRtfreport> selectList(TRtfreportCB cb);

}
