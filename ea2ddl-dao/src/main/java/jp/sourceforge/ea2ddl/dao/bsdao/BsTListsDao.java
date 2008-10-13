package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TLists;
import jp.sourceforge.ea2ddl.dao.cbean.TListsCB;

/**
 * The DAO interface of t_lists.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTListsDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TLists.class; // For S2Dao

    public int selectCount(TListsCB cb);
    public List<TLists> selectList(TListsCB cb);

}
