package jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info;


import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;

/**
 * The class of referer information.
 * 
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public interface RelationInfo {

    public String getRelationPropertyName();

    public DBMeta getLocalDBMeta();

    public DBMeta getTargetDBMeta();

    public java.util.Map<ColumnInfo, ColumnInfo> getLocalTargetColumnInfoMap();

    public boolean isOneToOne();

    public boolean isReferrer();
}
