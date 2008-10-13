package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TConstants;
import jp.sourceforge.ea2ddl.dao.cbean.TConstantsCB;

/**
 * The DAO interface of t_constants.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTConstantsDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TConstants.class; // For S2Dao

    public int selectCount(TConstantsCB cb);
    public List<TConstants> selectList(TConstantsCB cb);

}
