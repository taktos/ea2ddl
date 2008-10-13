package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TDiagramobjects;
import jp.sourceforge.ea2ddl.dao.cbean.TDiagramobjectsCB;

/**
 * The DAO interface of t_diagramobjects.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTDiagramobjectsDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TDiagramobjects.class; // For S2Dao

    public int selectCount(TDiagramobjectsCB cb);
    public List<TDiagramobjects> selectList(TDiagramobjectsCB cb);

}
