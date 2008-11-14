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
		final TPackage pkg = _bhv.selectPackage("ビュー/クラスビュー/ER図/EXAMPLEDB");
		assertNotNull(pkg);
		assertEquals("EXAMPLEDB", pkg.getName());
	}

}
