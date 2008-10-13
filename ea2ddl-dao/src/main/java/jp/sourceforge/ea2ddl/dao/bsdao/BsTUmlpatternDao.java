package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TUmlpattern;
import jp.sourceforge.ea2ddl.dao.cbean.TUmlpatternCB;

/**
 * The DAO interface of t_umlpattern.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTUmlpatternDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TUmlpattern.class; // For S2Dao

    public int selectCount(TUmlpatternCB cb);
    public List<TUmlpattern> selectList(TUmlpatternCB cb);

}
