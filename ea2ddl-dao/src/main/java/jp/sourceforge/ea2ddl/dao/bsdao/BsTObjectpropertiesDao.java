package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TObjectproperties;
import jp.sourceforge.ea2ddl.dao.cbean.TObjectpropertiesCB;

/**
 * The DAO interface of t_objectproperties.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTObjectpropertiesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TObjectproperties.class; // For S2Dao

    public int selectCount(TObjectpropertiesCB cb);
    public List<TObjectproperties> selectList(TObjectpropertiesCB cb);

}
