package jp.sourceforge.ea2ddl.dao.exbhv;

import static org.junit.Assert.*;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TObject;
import jp.sourceforge.ea2ddl.dao.exentity.TPackage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.framework.unit.Seasar2;
import org.seasar.framework.unit.annotation.RootDicon;

@RunWith(Seasar2.class)
@RootDicon("app.dicon")
public class TObjectBhvTest {

	TObjectBhv _bhv;
	TPackageBhv _pkgBhv;

	@Test
	public void testSelectEntityInteger() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSelectListByStereotype() {
		final TPackage pkg = _pkgBhv.selectPackage("クラスビュー/ER図/SIMPLEDB");
		final List<TObject> tables = _bhv.selectListByStereotype(pkg, "table");
	}

}
