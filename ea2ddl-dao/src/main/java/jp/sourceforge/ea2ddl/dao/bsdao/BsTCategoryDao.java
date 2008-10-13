package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TCategory;
import jp.sourceforge.ea2ddl.dao.cbean.TCategoryCB;

/**
 * The DAO interface of t_category.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTCategoryDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TCategory.class; // For S2Dao

    public int selectCount(TCategoryCB cb);
    public List<TCategory> selectList(TCategoryCB cb);

}
