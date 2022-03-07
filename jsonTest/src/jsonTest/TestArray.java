package jsonTest;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestArray {
	
	public static void TestArray() {
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
		
		JSONObject JsonObj = new JSONObject(jsonString);
		JSONArray JsonArray = JsonObj.getJSONArray("posts");
		
		for(int i=0; i<JsonArray.length(); i++) {
			JSONObject JsonObjPosts = JsonArray.getJSONObject(i);
			
			String title = JsonObjPosts.getString("title");
			String url = JsonObjPosts.getString("url");
			boolean draft = JsonObjPosts.getBoolean("draft");
			
			if(title.equals("PROTEN_PC")) {
				System.out.println(title);
				System.out.println(url);
				System.out.println(draft);
			}
		}
	}

}
