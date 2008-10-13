package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TPackage;
import jp.sourceforge.ea2ddl.dao.cbean.TPackageCB;

/**
 * The DAO interface of t_package.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTPackageDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TPackage.class; // For S2Dao

    public int selectCount(TPackageCB cb);
    public List<TPackage> selectList(TPackageCB cb);

}
