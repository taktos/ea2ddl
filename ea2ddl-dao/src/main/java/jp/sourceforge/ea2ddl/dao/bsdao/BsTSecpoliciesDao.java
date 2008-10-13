package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TSecpolicies;
import jp.sourceforge.ea2ddl.dao.cbean.TSecpoliciesCB;

/**
 * The DAO interface of t_secpolicies.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTSecpoliciesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TSecpolicies.class; // For S2Dao

    public int selectCount(TSecpoliciesCB cb);
    public List<TSecpolicies> selectList(TSecpoliciesCB cb);

}
