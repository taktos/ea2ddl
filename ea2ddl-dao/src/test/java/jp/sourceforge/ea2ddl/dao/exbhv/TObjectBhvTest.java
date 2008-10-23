package jp.sourceforge.ea2ddl.dao.exbhv;

import static org.junit.Assert.assertTrue;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TObject;

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
	public void testSelectList() {
		final List<TObject> tableList = _bhv.selectList("ビュー/クラスビュー/ER図/EXAMPLEDB", "table", null);
		assertTrue(0 < tableList.size());
	}

	@Test
	public void testSelectList_Note() {
		final List<TObject> noteList = _bhv.selectList("ビュー/クラスビュー/ER図/EXAMPLEDB", null, "Note");
		assertTrue(0 < noteList.size());
	}
}
