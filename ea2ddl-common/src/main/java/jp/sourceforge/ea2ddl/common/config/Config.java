/**
 * 
 */
package jp.sourceforge.ea2ddl.common.config;

/**
 * @author takiguchi
 *
 */
public interface Config {

	String getProperty(String key);
	String getProperty(String key, String defaultValue);
}
