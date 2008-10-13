package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TIssues;
import jp.sourceforge.ea2ddl.dao.cbean.TIssuesCB;

/**
 * The DAO interface of t_issues.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTIssuesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TIssues.class; // For S2Dao

    public int selectCount(TIssuesCB cb);
    public List<TIssues> selectList(TIssuesCB cb);

}
