package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TObjectconstraint;
import jp.sourceforge.ea2ddl.dao.cbean.TObjectconstraintCB;

/**
 * The DAO interface of t_objectconstraint.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTObjectconstraintDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TObjectconstraint.class; // For S2Dao

    public int selectCount(TObjectconstraintCB cb);
    public List<TObjectconstraint> selectList(TObjectconstraintCB cb);

}
