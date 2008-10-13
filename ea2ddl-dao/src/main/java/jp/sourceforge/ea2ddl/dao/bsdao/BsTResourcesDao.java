package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TResources;
import jp.sourceforge.ea2ddl.dao.cbean.TResourcesCB;

/**
 * The DAO interface of t_resources.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTResourcesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TResources.class; // For S2Dao

    public int selectCount(TResourcesCB cb);
    public List<TResources> selectList(TResourcesCB cb);

}
