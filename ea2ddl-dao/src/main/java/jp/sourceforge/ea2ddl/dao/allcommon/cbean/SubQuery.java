package jp.sourceforge.ea2ddl.dao.allcommon.cbean;

public interface SubQuery<SUB_CB extends ConditionBean> {
    public void query(SUB_CB subCB);
}
