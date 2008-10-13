package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TPalette;
import jp.sourceforge.ea2ddl.dao.cbean.TPaletteCB;

/**
 * The DAO interface of t_palette.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTPaletteDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TPalette.class; // For S2Dao

    public int selectCount(TPaletteCB cb);
    public List<TPalette> selectList(TPaletteCB cb);

}
