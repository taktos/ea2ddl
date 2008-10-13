package jp.sourceforge.ea2ddl.dao.allcommon.cbean;

public interface UnionQuery<UNION_CB extends ConditionBean> {
    public void query(UNION_CB unionCB);
}
