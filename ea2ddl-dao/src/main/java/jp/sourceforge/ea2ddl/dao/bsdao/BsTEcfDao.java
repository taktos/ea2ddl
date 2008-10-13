package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TEcf;
import jp.sourceforge.ea2ddl.dao.cbean.TEcfCB;

/**
 * The DAO interface of t_ecf.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTEcfDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TEcf.class; // For S2Dao

    public int selectCount(TEcfCB cb);
    public List<TEcf> selectList(TEcfCB cb);

}
