/**
 * 
 */
package jp.sourceforge.ea2ddl.common.config;

/**
 * @author taktos
 *
 */
public interface Config {

	String getProperty(String key);
	String getProperty(String key, String defaultValue);
	boolean getBoolean(String key);
}
