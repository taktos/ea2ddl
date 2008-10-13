package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TEfforttypes;
import jp.sourceforge.ea2ddl.dao.cbean.TEfforttypesCB;

/**
 * The DAO interface of t_efforttypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTEfforttypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TEfforttypes.class; // For S2Dao

    public int selectCount(TEfforttypesCB cb);
    public List<TEfforttypes> selectList(TEfforttypesCB cb);

}
