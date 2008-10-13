package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TFiles;
import jp.sourceforge.ea2ddl.dao.cbean.TFilesCB;

/**
 * The DAO interface of t_files.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTFilesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TFiles.class; // For S2Dao

    public int selectCount(TFilesCB cb);
    public List<TFiles> selectList(TFilesCB cb);

}
