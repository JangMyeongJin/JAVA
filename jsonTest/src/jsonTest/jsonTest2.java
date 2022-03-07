package jsonTest;

import org.json.JSONObject;

public class jsonTest2 {
	public static void jsonTest2() {
		
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
		JSONObject jsonObj = new JSONObject(jsonString);
		
		JSONObject objPost1 = jsonObj.getJSONObject("post1");
		String title = objPost1.getString("title");
		
		JSONObject objPost2 = jsonObj.getJSONObject("post2");
		String url = objPost2.getString("url");
		
		System.out.println(title);
		System.out.println(url);
	}

}
