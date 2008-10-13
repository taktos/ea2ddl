package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TObjecteffort;
import jp.sourceforge.ea2ddl.dao.cbean.TObjecteffortCB;

/**
 * The DAO interface of t_objecteffort.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTObjecteffortDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TObjecteffort.class; // For S2Dao

    public int selectCount(TObjecteffortCB cb);
    public List<TObjecteffort> selectList(TObjecteffortCB cb);

}
