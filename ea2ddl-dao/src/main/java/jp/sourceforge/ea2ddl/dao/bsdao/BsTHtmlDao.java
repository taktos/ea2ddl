package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.THtml;
import jp.sourceforge.ea2ddl.dao.cbean.THtmlCB;

/**
 * The DAO interface of t_html.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTHtmlDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = THtml.class; // For S2Dao

    public int selectCount(THtmlCB cb);
    public List<THtml> selectList(THtmlCB cb);

}
