package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TDiagramtypes;
import jp.sourceforge.ea2ddl.dao.cbean.TDiagramtypesCB;

/**
 * The DAO interface of t_diagramtypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTDiagramtypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TDiagramtypes.class; // For S2Dao

    public int selectCount(TDiagramtypesCB cb);
    public List<TDiagramtypes> selectList(TDiagramtypesCB cb);

}
