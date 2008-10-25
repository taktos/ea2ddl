package jp.sourceforge.ea2ddl.ddl.factory.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import jp.sourceforge.ea2ddl.dao.exentity.TPackage;
import jp.sourceforge.ea2ddl.ddl.model.DatabaseModel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.framework.unit.Seasar2;
import org.seasar.framework.unit.annotation.RootDicon;

@RunWith(Seasar2.class)
@RootDicon("ea2ddl.dicon")
public class DatabaseModelFactoryImplTest {

	DatabaseModelFactoryImpl factory;

	@Test
	public void testCreate() {
		final DatabaseModel model = factory.create();
		assertNotNull(model);
	}

	@Test
	public void testGetPackage() {
		final TPackage pkg = factory.getPackage();
		assertNotNull(pkg);
		assertEquals("EXAMPLEDB", pkg.getName());
	}

}
