package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TObjectresource;
import jp.sourceforge.ea2ddl.dao.cbean.TObjectresourceCB;

/**
 * The DAO interface of t_objectresource.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTObjectresourceDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TObjectresource.class; // For S2Dao

    public int selectCount(TObjectresourceCB cb);
    public List<TObjectresource> selectList(TObjectresourceCB cb);

}
