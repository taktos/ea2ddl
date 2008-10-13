package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TDiagramlinks;
import jp.sourceforge.ea2ddl.dao.cbean.TDiagramlinksCB;

/**
 * The DAO interface of t_diagramlinks.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTDiagramlinksDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TDiagramlinks.class; // For S2Dao

    public int selectCount(TDiagramlinksCB cb);
    public List<TDiagramlinks> selectList(TDiagramlinksCB cb);

}
