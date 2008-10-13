package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TTaggedvalue;
import jp.sourceforge.ea2ddl.dao.cbean.TTaggedvalueCB;

/**
 * The DAO interface of t_taggedvalue.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTTaggedvalueDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TTaggedvalue.class; // For S2Dao

    public int selectCount(TTaggedvalueCB cb);
    public List<TTaggedvalue> selectList(TTaggedvalueCB cb);

}
