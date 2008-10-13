package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TObject;
import jp.sourceforge.ea2ddl.dao.cbean.TObjectCB;

/**
 * The DAO interface of t_object.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTObjectDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TObject.class; // For S2Dao

    public int selectCount(TObjectCB cb);
    public List<TObject> selectList(TObjectCB cb);

}
