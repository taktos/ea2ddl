package jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.hierarchy.basic;


import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.hierarchy.HierarchySourceColumn;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.ColumnInfo;

/**
 * @author DBFlute(AutoGenerator)
 */
public class HierarchySourceEntityColumn implements HierarchySourceColumn {

    protected ColumnInfo columnInfo;

    public HierarchySourceEntityColumn(ColumnInfo columnInfo) {
        this.columnInfo = columnInfo;
    }

    public String getColumnName() {
        return columnInfo.getColumnDbName();
    }

    public java.lang.reflect.Method findGetter() {
        return columnInfo.findGetter();
    }
}