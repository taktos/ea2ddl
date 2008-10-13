package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TStereotypes;
import jp.sourceforge.ea2ddl.dao.cbean.TStereotypesCB;

/**
 * The DAO interface of t_stereotypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTStereotypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TStereotypes.class; // For S2Dao

    public int selectCount(TStereotypesCB cb);
    public List<TStereotypes> selectList(TStereotypesCB cb);

}
