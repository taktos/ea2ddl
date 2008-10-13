package jp.sourceforge.ea2ddl.dao.exbhv;

import static org.junit.Assert.*;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TAttribute;
import jp.sourceforge.ea2ddl.dao.exentity.TObject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.framework.unit.Seasar2;
import org.seasar.framework.unit.annotation.RootDicon;

@RunWith(Seasar2.class)
@RootDicon("app.dicon")
public class TAttributeBhvTest {

	TAttributeBhv _bhv;
	TObjectBhv _objectBhv;

	@Test
	public void testSelectColumns() {
		final TObject obj = _objectBhv.selectEntity(32);
		final List<TAttribute> columns = _bhv.selectColumns(obj);
		assertNotNull(columns);
	}

}
