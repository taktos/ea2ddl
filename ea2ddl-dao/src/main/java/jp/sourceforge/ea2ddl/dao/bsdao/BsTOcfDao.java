package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TOcf;
import jp.sourceforge.ea2ddl.dao.cbean.TOcfCB;

/**
 * The DAO interface of t_ocf.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTOcfDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TOcf.class; // For S2Dao

    public int selectCount(TOcfCB cb);
    public List<TOcf> selectList(TOcfCB cb);

}
