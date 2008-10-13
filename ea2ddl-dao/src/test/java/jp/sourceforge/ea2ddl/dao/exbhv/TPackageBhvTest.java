package jp.sourceforge.ea2ddl.dao.exbhv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import jp.sourceforge.ea2ddl.dao.exentity.TPackage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.framework.unit.Seasar2;
import org.seasar.framework.unit.annotation.RootDicon;

@RunWith(Seasar2.class)
@RootDicon("app.dicon")
public class TPackageBhvTest {
	TPackageBhv _bhv;

	@Test
	public void testSelectPackage() {
		final TPackage pkg = _bhv.selectPackage("クラスビュー/ER図/SIMPLEDB");
		assertNotNull(pkg);
		assertEquals("SIMPLEDB", pkg.getName());
	}

	@Test
	public void testSelectRoot() {
		final TPackage root = _bhv.selectRoot();
		assertNotNull(root);
		assertEquals("ビュー", root.getName());
	}

}