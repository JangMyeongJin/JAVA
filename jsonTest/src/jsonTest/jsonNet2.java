package jsonTest;

import org.json.JSONObject;

public class jsonNet2 {

	public static void jsonNet2() {
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
		JSONObject jobject = new JSONObject(jsonString);
		
		JSONObject post1json = jobject.getJSONObject("post1");
		
		String title = post1json.getString("title");
		String url = post1json.getString("url");
		boolean draft = post1json.getBoolean("draft");
		System.out.println(title);
		System.out.println(url);
		System.out.println(draft);
		
		JSONObject post2json = jobject.getJSONObject("post2");
		
		String title2 = post2json.getString("title");
		String url2 = post2json.getString("url");
		boolean draft2 = post2json.getBoolean("draft");
		System.out.println(title2);
		System.out.println(url2);
		System.out.println(draft2);
	}
}
