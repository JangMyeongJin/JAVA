package jsonTest;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonNetArray {

	public static void jsonNetArray() {
		String jsonString = "{ "
				+ "   'posts': [ "
				+ "       { "
				+ "			'title': 'PROTEN_M', "
				+ "			'url': 'http://m.proten.co.kr/', "
				+ "			'draft': 'true' "
				+ "       }, "
				+ "       { "
				+ "			'title': 'PROTEN_PC', "
				+ "			'url': 'http://www.proten.co.kr//', "
				+ "			'draft': 'true' "
				+ "       }, "
				+ "       { "
				+ "		   'title': '·Ôµ¥', "
				+ "		   'url': 'https://www.ldcc.co.kr/', "
				+ "		   'draft': 'true' "
				+ "       } "
				+ "   ] "
				+ "}";
		JSONObject jobject = new JSONObject(jsonString);
		
		JSONArray jArray = jobject.getJSONArray("posts");
		
		for(int i=0; i<jArray.length(); i++) {
			JSONObject obj = jArray.getJSONObject(i);
			String title = obj.getString("title");
			String url = obj.getString("url");
			String draft = obj.getString("draft");
			System.out.println(title);
			System.out.println(url);
			System.out.println(draft);
			System.out.println("====================");
		}
	}
}
