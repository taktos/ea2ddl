package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TPaletteitem;
import jp.sourceforge.ea2ddl.dao.cbean.TPaletteitemCB;

/**
 * The DAO interface of t_paletteitem.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTPaletteitemDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TPaletteitem.class; // For S2Dao

    public int selectCount(TPaletteitemCB cb);
    public List<TPaletteitem> selectList(TPaletteitemCB cb);

}
