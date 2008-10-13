package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TAttributeconstraints;
import jp.sourceforge.ea2ddl.dao.cbean.TAttributeconstraintsCB;

/**
 * The DAO interface of t_attributeconstraints.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTAttributeconstraintsDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TAttributeconstraints.class; // For S2Dao

    public int selectCount(TAttributeconstraintsCB cb);
    public List<TAttributeconstraints> selectList(TAttributeconstraintsCB cb);

}
