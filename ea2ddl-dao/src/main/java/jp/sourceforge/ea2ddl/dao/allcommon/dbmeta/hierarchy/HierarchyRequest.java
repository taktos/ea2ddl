package jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.hierarchy;


import java.util.ArrayList;
import java.util.List;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.hierarchy.basic.HierarchySourceEntityColumn;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.hierarchy.basic.HierarchySourceEntityListIterator;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.ColumnInfo;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.RelationInfo;

/**
 * The request of hierarchy.
 * 
 * @author DBFlute(AutoGenerator)
 * @param <LOCAL_ENTITY> The type of local entity.
 */
@SuppressWarnings("unchecked")
public class HierarchyRequest<LOCAL_ENTITY extends Entity> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The dbmeta of desination. */
    protected DBMeta destinationDBMeta;

    /** The iterator of hierarychy source. */
    protected HierarchySourceIterator sourceIterator;

    /** The list of request element. */
    protected List<HierarchyRequestElement> requestElementList = new ArrayList<HierarchyRequestElement>();

    /** The set of already registered source column info for check. */
    protected java.util.Set<ColumnInfo> alreadyRegisteredSourceColumnInfoSet4Check = new java.util.HashSet<ColumnInfo>();

    /** First source column info for check. */
    protected ColumnInfo firstSourceColumnInfo4Check;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     * 
     * @param localEntityType The type of local entity. (NotNull)
     */
    public HierarchyRequest(Class<LOCAL_ENTITY> localEntityType) {
        LOCAL_ENTITY localEntity;
        try {
            localEntity = localEntityType.newInstance();
        } catch (InstantiationException e) {
            String msg = "localEntityType.newInstance() threw the InstantiationException:";
            msg = msg + " localEntityType=" + localEntityType;
            throw new IllegalStateException(msg, e);
        } catch (IllegalAccessException e) {
            String msg = "localEntityType.newInstance() threw the IllegalAccessException:";
            msg = msg + " localEntityType=" + localEntityType;
            throw new IllegalStateException(msg, e);
        }
        destinationDBMeta = localEntity.getDBMeta();
    }

    // ===================================================================================
    //                                                                         Easy-to-Use
    //                                                                         ===========
    // -----------------------------------------------------
    //                                                public
    //                                                ------
    /**
     * Register the list of source. <br />
     * This method uses the default source iterator.
     * 
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source. (NotNull)
     */
    public <SOURCE> void registerSourceList(java.util.List<SOURCE> sourceList) {
        sourceIterator = createDefaultSourceIterator(sourceList);
    }

    /**
     * Set up mapping between the source column and the destination relation.
     * 
     * @param sourceColumn The column of source. (NotNull)
     * @param relationTrace The relation trace of destination. (NotNull)
     */
    public void mapping(HierarchySourceColumn sourceColumn, DBMeta.RelationTrace relationTrace) {
        setupElement(sourceColumn, relationTrace.getTraceColumn());
        addRelationToLastElement(relationTrace.getTraceRelation());
    }

    /**
     * Set up mapping between the source column and the destination relation.
     * 
     * @param sourceColumnInfo The column info of source. (NotNull)
     * @param relationTrace The relation trace of destination. (NotNull)
     */
    public void mapping(ColumnInfo sourceColumnInfo, DBMeta.RelationTrace relationTrace) {
        setupElement(sourceColumnInfo, relationTrace.getTraceColumn());
        addRelationToLastElement(relationTrace.getTraceRelation());
    }

    // -----------------------------------------------------
    //                                               internal
    //                                               -------
    /**
     * Set up element.
     * 
     * @param sourceColumn The column of source. (NotNull)
     * @param destinationColumnInfo The column info of destination. (NotNull)
     */
    protected void setupElement(HierarchySourceColumn sourceColumn, ColumnInfo destinationColumnInfo) {
        assertSameLocalDestinationDBMeta(destinationColumnInfo);
        final HierarchyRequestElement element = new HierarchyRequestElement();
        requestElementList.add(element);
        element.mapping(sourceColumn, destinationColumnInfo);
        element.setDestinationDBMeta(destinationColumnInfo.getDBMeta());
    }

    /**
     * Set up element. <br />
     * This method uses the default source column.
     * 
     * @param sourceColumnInfo The column info of source. (NotNull)
     * @param destinationColumnInfo The column info of destination. (NotNull)
     */
    protected void setupElement(ColumnInfo sourceColumnInfo, ColumnInfo destinationColumnInfo) {
        if (alreadyRegisteredSourceColumnInfoSet4Check.contains(sourceColumnInfo)) {
            String msg = "The wrong sourceColumnInfo!" + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The source column has already been registered:" + getLineSeparator();
            msg = msg + "- - - - -" + getLineSeparator();
            msg = msg + " sourceColumnInfo=" + sourceColumnInfo + getLineSeparator();
            msg = msg + " registeredColumnInfo=" + alreadyRegisteredSourceColumnInfoSet4Check + getLineSeparator();
            msg = msg + "* * * * * * * * * */" + getLineSeparator();
            throw new IllegalStateException(msg);
        }
        alreadyRegisteredSourceColumnInfoSet4Check.add(sourceColumnInfo);
        assertSameSourceDBMeta(sourceColumnInfo);
        assertSameLocalDestinationDBMeta(destinationColumnInfo);
        final HierarchyRequestElement element = new HierarchyRequestElement();
        requestElementList.add(element);
        final HierarchySourceColumn sourceColumn = createDefaultSourceColumn(sourceColumnInfo);
        element.mapping(sourceColumn, destinationColumnInfo);
        element.setDestinationDBMeta(destinationColumnInfo.getDBMeta());
    }

    /**
     * Make relatetion by the list of relation info.
     * 
     * @param relationInfoList The list of relation info. (NotNull)
     */
    protected void addRelationToLastElement(List<RelationInfo> relationInfoList) {
        if (requestElementList.isEmpty()) {
            String msg = "You shuold invoke mapping() before invoking relation()!";
            throw new IllegalStateException(msg);
        }
        for (RelationInfo relationInfo : relationInfoList) {
            final int lastIndex = requestElementList.size() - 1;
            final HierarchyRequestElement element = (HierarchyRequestElement) requestElementList.get(lastIndex);
            element.relation(relationInfo);
        }
    }

    /**
     * Assert same source dbmeta.
     * 
     * @param sourceColumnInfo The column info of source. (NotNull)
     */
    protected void assertSameSourceDBMeta(ColumnInfo sourceColumnInfo) {
        if (firstSourceColumnInfo4Check == null) {
            firstSourceColumnInfo4Check = sourceColumnInfo;
            return;
        }
        final DBMeta expectedDBMeta = firstSourceColumnInfo4Check.getDBMeta();
        final DBMeta actualDBMeta = sourceColumnInfo.getDBMeta();
        if (!expectedDBMeta.equals(actualDBMeta)) {
            String msg = "The wrong sourceColumnInfo!" + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The dbmeta of sourceColumnInfo is difference from";
            msg = msg + " the one of Your First Source Column Info:" + getLineSeparator();
            msg = msg + "- - - - -" + getLineSeparator();
            msg = msg + "sourceColumnInfo=" + sourceColumnInfo + getLineSeparator();
            msg = msg + "firstSourceColumnInfo4Check=" + firstSourceColumnInfo4Check + getLineSeparator();
            msg = msg + "* * * * * * * * * */" + getLineSeparator();
            throw new IllegalStateException(msg);
        }
    }

    /**
     * Assert same source dbmeta.
     * @param destinationColumnInfo The column info of destination. (NotNull)
     */
    protected void assertSameLocalDestinationDBMeta(ColumnInfo destinationColumnInfo) {
        if (!requestElementList.isEmpty()) {
            final HierarchyRequestElement currentElement = currentElement();
            final List<RelationInfo> relationInfoList = currentElement.getRelationInfoList();
            if (relationInfoList.isEmpty()) {
                final DBMeta actualDBMeta = currentElement().getDestinationDBMeta();
                final DBMeta expectedDBMeta = destinationDBMeta;
                if (!expectedDBMeta.equals(actualDBMeta)) {
                    String msg = "The wrong destinationColumnInfo!" + getLineSeparator();
                    msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
                    msg = msg + "The dbmeta of destinationColumnInfo is difference from";
                    msg = msg + " the one of Your Local Entity:" + getLineSeparator();
                    msg = msg + "- - - - -" + getLineSeparator();
                    msg = msg + "destinationColumnInfo=" + currentElement.getDestinationColumnInfo() + getLineSeparator();
                    msg = msg + "localEntity=" + destinationDBMeta.getEntityTypeName() + getLineSeparator();
                    msg = msg + "* * * * * * * * * */" + getLineSeparator();
                    throw new IllegalStateException(msg);
                }
            }
        }
    }

    /**
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source. (NotNull)
     * @return Default source iterator. (NotNull)
     */
    protected <SOURCE> HierarchySourceIterator createDefaultSourceIterator(java.util.List<SOURCE> sourceList) {
        return new HierarchySourceEntityListIterator<SOURCE>(sourceList);
    }

    /**
     * @param sourceColumnInfo The column info of source. (NotNull)
     * @return Default source column. (NotNull)
     */
    protected HierarchySourceColumn createDefaultSourceColumn(ColumnInfo sourceColumnInfo) {
        return new HierarchySourceEntityColumn(sourceColumnInfo);
    }

    /**
     * Get current element.
     * 
     * @return Current element. (NotNull)
     */
    protected HierarchyRequestElement currentElement() {
        final int lastIndex = requestElementList.size() - 1;
        return (HierarchyRequestElement) requestElementList.get(lastIndex);
    }

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /**
     * @param relationPropertyKey Relation Property key. (NotNull)
     * @return The list of request element. (NotNull)
     */
    public List<HierarchyRequestElement> findPrimaryKeyElement(String relationPropertyKey) {
        final List<HierarchyRequestElement> resultList = new ArrayList<HierarchyRequestElement>();
        for (HierarchyRequestElement element : requestElementList) {
            if (!relationPropertyKey.equals(element.getRelationPropertyKey())) {
                continue;
            }
            final ColumnInfo destinationColumnInfo = element.getDestinationColumnInfo();
            if (!destinationColumnInfo.isPrimary()) {
                continue;
            }
            resultList.add(element);
        }
        if (resultList.isEmpty()) {
            String msg = "Not found primary key element by relationPropertyKey in requestElementList: ";
            msg = msg + " relationPropertyKey=" + relationPropertyKey + " requestElementList=" + requestElementList;
            throw new IllegalStateException(msg);
        }
        return resultList;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public DBMeta getDestinationDBMeta() {
        return destinationDBMeta;
    }

    public void setDestinationDBMeta(DBMeta destinationDBMeta) {
        this.destinationDBMeta = destinationDBMeta;
    }

    public List<HierarchyRequestElement> getRequestElementList() {
        return requestElementList;
    }

    public void addRequestElementList(HierarchyRequestElement element) {
        this.requestElementList.add(element);
    }

    public HierarchySourceIterator getSourceIterator() {
        return sourceIterator;
    }

    public void setSourceIterator(HierarchySourceIterator sourceIterator) {
        this.sourceIterator = sourceIterator;
    }

    // ===================================================================================
    //                                                                              Helper
    //                                                                              ======
    /**
     * Get the value of line separator.
     * 
     * @return The value of line separator. (NotNull)
     */
    protected String getLineSeparator() {
        return System.getProperty("line.separator");
    }
}
