package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TTemplate;
import jp.sourceforge.ea2ddl.dao.cbean.TTemplateCB;

/**
 * The DAO interface of t_template.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTTemplateDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TTemplate.class; // For S2Dao

    public int selectCount(TTemplateCB cb);
    public List<TTemplate> selectList(TTemplateCB cb);

}
