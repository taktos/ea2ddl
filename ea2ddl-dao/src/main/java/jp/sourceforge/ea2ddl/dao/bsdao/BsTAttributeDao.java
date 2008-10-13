package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TAttribute;
import jp.sourceforge.ea2ddl.dao.cbean.TAttributeCB;

/**
 * The DAO interface of t_attribute.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTAttributeDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TAttribute.class; // For S2Dao

    public int selectCount(TAttributeCB cb);
    public List<TAttribute> selectList(TAttributeCB cb);

}
