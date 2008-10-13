package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TDocument;
import jp.sourceforge.ea2ddl.dao.cbean.TDocumentCB;

/**
 * The DAO interface of t_document.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTDocumentDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TDocument.class; // For S2Dao

    public int selectCount(TDocumentCB cb);
    public List<TDocument> selectList(TDocumentCB cb);

}
