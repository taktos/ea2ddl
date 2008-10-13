package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TTestclass;
import jp.sourceforge.ea2ddl.dao.cbean.TTestclassCB;

/**
 * The DAO interface of t_testclass.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTTestclassDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TTestclass.class; // For S2Dao

    public int selectCount(TTestclassCB cb);
    public List<TTestclass> selectList(TTestclassCB cb);

}
