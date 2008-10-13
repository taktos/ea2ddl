package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TRoleconstraint;
import jp.sourceforge.ea2ddl.dao.cbean.TRoleconstraintCB;

/**
 * The DAO interface of t_roleconstraint.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTRoleconstraintDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TRoleconstraint.class; // For S2Dao

    public int selectCount(TRoleconstraintCB cb);
    public List<TRoleconstraint> selectList(TRoleconstraintCB cb);

}
