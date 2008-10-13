package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TTcf;
import jp.sourceforge.ea2ddl.dao.cbean.TTcfCB;

/**
 * The DAO interface of t_tcf.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTTcfDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TTcf.class; // For S2Dao

    public int selectCount(TTcfCB cb);
    public List<TTcf> selectList(TTcfCB cb);

}
