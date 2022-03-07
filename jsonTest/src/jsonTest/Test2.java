package jsonTest;

import org.json.JSONObject;

public class Test2 {
	public static void Test2() {
		String jsonString = "{ "
				+ "   'post1': { "
				+ "       'title': 'PROTEN_M', "
				+ "       'url': 'http://m.proten.co.kr/', "
				+ "       'draft': 'true' "
				+ "  }, "
				+ "   'post2': { "
				+ "       'title': 'PROTEN_PC', "
				+ "       'url': 'http://www.proten.co.kr//', "
				+ "       'draft': 'true' "
				+ "   } "
				+ "}";
		JSONObject JObject = new JSONObject(jsonString);
		
		JSONObject JsonObjPost2 = JObject.getJSONObject("post2");
		
		String title = JsonObjPost2.getString("title");
		
		System.out.println(title);
	}

}
