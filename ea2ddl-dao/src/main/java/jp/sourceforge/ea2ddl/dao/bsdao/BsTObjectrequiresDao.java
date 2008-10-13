package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TObjectrequires;
import jp.sourceforge.ea2ddl.dao.cbean.TObjectrequiresCB;

/**
 * The DAO interface of t_objectrequires.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTObjectrequiresDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TObjectrequires.class; // For S2Dao

    public int selectCount(TObjectrequiresCB cb);
    public List<TObjectrequires> selectList(TObjectrequiresCB cb);

}
