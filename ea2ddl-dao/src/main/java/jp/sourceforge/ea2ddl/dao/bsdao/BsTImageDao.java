package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TImage;
import jp.sourceforge.ea2ddl.dao.cbean.TImageCB;

/**
 * The DAO interface of t_image.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTImageDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TImage.class; // For S2Dao

    public int selectCount(TImageCB cb);
    public List<TImage> selectList(TImageCB cb);

}
