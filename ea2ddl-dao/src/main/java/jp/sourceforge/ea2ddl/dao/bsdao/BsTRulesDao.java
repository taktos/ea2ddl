package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TRules;
import jp.sourceforge.ea2ddl.dao.cbean.TRulesCB;

/**
 * The DAO interface of t_rules.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTRulesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TRules.class; // For S2Dao

    public int selectCount(TRulesCB cb);
    public List<TRules> selectList(TRulesCB cb);

}
