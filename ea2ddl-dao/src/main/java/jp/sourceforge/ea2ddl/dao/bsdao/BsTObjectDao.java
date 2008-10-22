package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TObject;
import jp.sourceforge.ea2ddl.dao.cbean.TObjectCB;

/**
 * The DAO interface of t_object.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTObjectDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoWritable {

    public Class<?> BEAN = TObject.class; // For S2Dao

    public int selectCount(TObjectCB cb);
    public List<TObject> selectList(TObjectCB cb);

    int insert(TObject entity);
    int updateModifiedOnly(TObject entity);
    int delete(TObject entity);

    int[] insertList(List<TObject> entityList);
    int[] updateList(List<TObject> entityList);
    int updateByQuery(TObjectCB cb, TObject entity);
    int[] deleteList(List<TObject> entityList);
    int deleteByQuery(TObjectCB cb);
}
