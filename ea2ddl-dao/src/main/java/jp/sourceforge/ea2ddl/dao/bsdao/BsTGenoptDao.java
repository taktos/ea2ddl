package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TGenopt;
import jp.sourceforge.ea2ddl.dao.cbean.TGenoptCB;

/**
 * The DAO interface of t_genopt.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTGenoptDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TGenopt.class; // For S2Dao

    public int selectCount(TGenoptCB cb);
    public List<TGenopt> selectList(TGenoptCB cb);

}
