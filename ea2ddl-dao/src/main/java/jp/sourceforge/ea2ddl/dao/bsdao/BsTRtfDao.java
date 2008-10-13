package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TRtf;
import jp.sourceforge.ea2ddl.dao.cbean.TRtfCB;

/**
 * The DAO interface of t_rtf.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTRtfDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TRtf.class; // For S2Dao

    public int selectCount(TRtfCB cb);
    public List<TRtf> selectList(TRtfCB cb);

}
