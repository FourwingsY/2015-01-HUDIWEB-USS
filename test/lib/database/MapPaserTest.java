package lib.database;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapPaserTest {

	@Test
	public void test() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "박");
		map.put("age", 17);
		map.put("birthday", new Date());
		MapParser.getObject(Member.class, map);
		System.out.println(map);
	}

}