package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TCardinality;
import jp.sourceforge.ea2ddl.dao.cbean.TCardinalityCB;

/**
 * The DAO interface of t_cardinality.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTCardinalityDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TCardinality.class; // For S2Dao

    public int selectCount(TCardinalityCB cb);
    public List<TCardinality> selectList(TCardinalityCB cb);

}
