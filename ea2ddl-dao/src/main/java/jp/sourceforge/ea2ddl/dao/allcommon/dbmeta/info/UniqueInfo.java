package jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info;


import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;

/**
 * The class of unique info.
 * 
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class UniqueInfo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DBMeta dbmeta;
    protected java.util.List<ColumnInfo> uniqueColumnList = new java.util.ArrayList<ColumnInfo>();
    protected boolean primary;

    // ===================================================================================
    //                                                                         Easy-to-Use
    //                                                                         ===========
    public boolean containsColumn(String columnName) {
        for (final java.util.Iterator ite = uniqueColumnList.iterator(); ite.hasNext(); ) {
            final ColumnInfo columnInfo = (ColumnInfo)ite.next();
            if (columnInfo.getColumnDbName().equals(columnName)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsColumn(ColumnInfo column) {
        return containsColumn(column.getColumnDbName());
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public DBMeta getDBMeta() {
        return dbmeta;
    }

    public void setDBMeta(DBMeta dbmeta) {
        this.dbmeta = dbmeta;
    }

    public java.util.List<ColumnInfo> getUniqueColumnList() {
        return uniqueColumnList;
    }

    public void addUniqueColumnList(ColumnInfo uniqueColumn) {
        this.uniqueColumnList.add(uniqueColumn);
    }

    public ColumnInfo getFirstColumn() {
        return (ColumnInfo)this.uniqueColumnList.get(0);
    }

    public boolean isTwoOrMore() {
        return this.uniqueColumnList.size() > 1;
    }

    public boolean isPrimary() {
        return this.primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }
}
