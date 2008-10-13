package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TObjectfiles;
import jp.sourceforge.ea2ddl.dao.cbean.TObjectfilesCB;

/**
 * The DAO interface of t_objectfiles.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTObjectfilesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TObjectfiles.class; // For S2Dao

    public int selectCount(TObjectfilesCB cb);
    public List<TObjectfiles> selectList(TObjectfilesCB cb);

}
