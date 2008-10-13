package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TObjectrisks;
import jp.sourceforge.ea2ddl.dao.cbean.TObjectrisksCB;

/**
 * The DAO interface of t_objectrisks.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTObjectrisksDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TObjectrisks.class; // For S2Dao

    public int selectCount(TObjectrisksCB cb);
    public List<TObjectrisks> selectList(TObjectrisksCB cb);

}
