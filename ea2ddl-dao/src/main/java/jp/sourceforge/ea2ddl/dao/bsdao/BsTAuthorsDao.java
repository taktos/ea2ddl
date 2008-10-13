package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TAuthors;
import jp.sourceforge.ea2ddl.dao.cbean.TAuthorsCB;

/**
 * The DAO interface of t_authors.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTAuthorsDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TAuthors.class; // For S2Dao

    public int selectCount(TAuthorsCB cb);
    public List<TAuthors> selectList(TAuthorsCB cb);

}
