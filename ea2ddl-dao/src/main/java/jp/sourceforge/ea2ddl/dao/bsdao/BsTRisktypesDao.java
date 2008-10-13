package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TRisktypes;
import jp.sourceforge.ea2ddl.dao.cbean.TRisktypesCB;

/**
 * The DAO interface of t_risktypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTRisktypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TRisktypes.class; // For S2Dao

    public int selectCount(TRisktypesCB cb);
    public List<TRisktypes> selectList(TRisktypesCB cb);

}
