package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TAttributetag;
import jp.sourceforge.ea2ddl.dao.cbean.TAttributetagCB;

/**
 * The DAO interface of t_attributetag.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTAttributetagDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TAttributetag.class; // For S2Dao

    public int selectCount(TAttributetagCB cb);
    public List<TAttributetag> selectList(TAttributetagCB cb);

}
