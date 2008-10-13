package jp.sourceforge.ea2ddl.dao.allcommon;

/**
 * The interface of entity defined common column.
 * @author DBFlute(AutoGenerator)
 */
public interface EntityDefinedCommonColumn extends Entity {

    /**
	 * Disable common column auto set up.
	 */
    public void disableCommonColumnAutoSetup();
	
    /**
	 * Can the entity set up common column by auto?
	 * @return Determination.
	 */
	public boolean canCommonColumnAutoSetup();
}
