package jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.rshandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

import org.seasar.dao.BeanMetaData;
import org.seasar.dao.RelationPropertyType;
import org.seasar.dao.RelationRowCreator;
import org.seasar.dao.RowCreator;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;

/**
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class InternalAbstractBeanMetaDataResultSetHandler extends InternalAbstractDtoMetaDataResultSetHandler {

	// ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private BeanMetaData beanMetaData;
    protected RelationRowCreator relationRowCreator;

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * @param beanMetaData Bean meta data. (NotNull)
     * @param rowCreator Row creator. (NotNull)
     * @param relationRowCreator Relation row creator. (NotNul)
     */
    public InternalAbstractBeanMetaDataResultSetHandler(BeanMetaData beanMetaData, RowCreator rowCreator, RelationRowCreator relationRowCreator) {
        super(beanMetaData, rowCreator);
        this.beanMetaData = beanMetaData;
        this.relationRowCreator = relationRowCreator;
    }

	// ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    /**
     * @param columnNames The set of column name. (NotNull)
     * @return The map of row property cache. Map{String(columnName), PropertyType} (NotNull)
     * @throws SQLException
     */
    protected Map createPropertyCache(Set columnNames) throws SQLException {
        // - - - - - - - - -
        // Override for Bean
        // - - - - - - - - -
        return rowCreator.createPropertyCache(columnNames, beanMetaData);
    }

    /**
     * @param rs Result set. (NotNull)
     * @param propertyCache The map of property cache. Map{String(columnName), PropertyType} (NotNull)
     * @return Created row. (NotNull)
     * @throws SQLException
     */
    protected Object createRow(ResultSet rs, Map propertyCache) throws SQLException {
        // - - - - - - - - -
        // Override for Bean
        // - - - - - - - - -
        final Class beanClass = beanMetaData.getBeanClass();
        return rowCreator.createRow(rs, propertyCache, beanClass);
    }

    /**
     * @param columnNames The set of column name. (NotNull)
     * @return The map of relation property cache. Map{String(relationNoSuffix), Map{String(columnName), PropertyType}} (NotNull)
     * @throws SQLException
     */
    protected Map createRelationPropertyCache(Set columnNames) throws SQLException {
        return relationRowCreator.createPropertyCache(columnNames, beanMetaData);
    }

    /**
     * @param rs Result set. (NotNull)
     * @param rpt The type of relation property. (NotNull)
     * @param columnNames The set of column name. (NotNull)
     * @param relKeyValues The map of rel key values. (Nullable)
     * @param relationPropertyCache The map of relation property cache. Map{String(relationNoSuffix), Map{String(columnName), PropertyType}} (NotNull)
     * @return Created relation row. (Nullable)
     * @throws SQLException
     */
    protected Object createRelationRow(ResultSet rs, RelationPropertyType rpt,
            Set columnNames, Map relKeyValues, Map relationPropertyCache) throws SQLException {
        return relationRowCreator.createRelationRow(rs, rpt, columnNames, relKeyValues, relationPropertyCache);
    }

    /**
     * @param row The row of result list. (NotNull)
     */
    protected void postCreateRow(final Object row) {
        if (row instanceof Entity) { // DBFlute Target
            ((Entity)row).clearModifiedPropertyNames();
        } else { // Basically Unreachable
            final BeanMetaData bmd = getBeanMetaData();
            final Set names = bmd.getModifiedPropertyNames(row);
            names.clear();
        }
    }

	// ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public BeanMetaData getBeanMetaData() {
        return beanMetaData;
    }
}
