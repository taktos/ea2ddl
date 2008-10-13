package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TGlossary;
import jp.sourceforge.ea2ddl.dao.cbean.TGlossaryCB;

/**
 * The DAO interface of t_glossary.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTGlossaryDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TGlossary.class; // For S2Dao

    public int selectCount(TGlossaryCB cb);
    public List<TGlossary> selectList(TGlossaryCB cb);

}
