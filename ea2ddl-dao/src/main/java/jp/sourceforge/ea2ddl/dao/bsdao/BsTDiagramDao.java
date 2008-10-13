package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TDiagram;
import jp.sourceforge.ea2ddl.dao.cbean.TDiagramCB;

/**
 * The DAO interface of t_diagram.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTDiagramDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TDiagram.class; // For S2Dao

    public int selectCount(TDiagramCB cb);
    public List<TDiagram> selectList(TDiagramCB cb);

}
