package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TScript;
import jp.sourceforge.ea2ddl.dao.cbean.TScriptCB;

/**
 * The DAO interface of t_script.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTScriptDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TScript.class; // For S2Dao

    public int selectCount(TScriptCB cb);
    public List<TScript> selectList(TScriptCB cb);

}
