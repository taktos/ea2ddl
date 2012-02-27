/**
 * 
 */
package jp.sourceforge.ea2ddl.common.config.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import jp.sourceforge.ea2ddl.common.config.Config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author taktos
 *
 */
public class ConfigImpl implements Config {
	private static final Log LOG = LogFactory.getLog(ConfigImpl.class);

	private Properties _prop = new Properties();

	public void load(String configPath) {
		InputStream in = null;
		try {
			in = new URL(configPath).openStream();
		} catch (MalformedURLException e) {
		} catch (IOException e) {
			LOG.warn("Failed to read resource:", e);
		}
		if (in == null) {
			in = Thread.currentThread().getContextClassLoader().getResourceAsStream(configPath);
		}
		if (in != null) {
			try {
				_prop.load(in);
				LOG.debug("config initialized.");
			} catch (IOException e) {
				LOG.warn("Failed to read resource:" + e);
			}
		}
	}

	public String getProperty(String key) {
		return _prop.getProperty(key);
	}

	public String getProperty(String key, String defaultValue) {
		return _prop.getProperty(key, defaultValue);
	}

	public boolean getBoolean(String key) {
		return "true".equalsIgnoreCase(getProperty(key, "false"));
	}
}
