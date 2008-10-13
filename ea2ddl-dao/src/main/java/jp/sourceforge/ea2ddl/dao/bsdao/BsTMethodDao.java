package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TMethod;
import jp.sourceforge.ea2ddl.dao.cbean.TMethodCB;

/**
 * The DAO interface of t_method.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTMethodDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TMethod.class; // For S2Dao

    public int selectCount(TMethodCB cb);
    public List<TMethod> selectList(TMethodCB cb);

}
