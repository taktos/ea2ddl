package jp.sourceforge.ea2ddl.common.config.impl;

import static org.junit.Assert.*;
import jp.sourceforge.ea2ddl.common.config.Config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.framework.unit.Seasar2;
import org.seasar.framework.unit.annotation.RootDicon;

@RunWith(Seasar2.class)
@RootDicon("app.dicon")
public class ConfigImplTest {

	Config config;

	@Test
	public void testGetPropertyString() {
		assertEquals("ビュー", config.getProperty("root.package.name"));
	}

	@Test
	public void testGetPropertyStringString() throws Exception {
		assertEquals("テスト", config.getProperty("test.key", "テスト"));
	}
}
