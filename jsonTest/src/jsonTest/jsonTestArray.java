package jsonTest;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonTestArray {
	
	public static void jsonTestArray() {
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
		
		JSONObject jsonObj = new JSONObject(jsonString);
		JSONArray jsonList = jsonObj.getJSONArray("posts");
		
		for(int i=0; i<jsonList.length(); i++) {
			JSONObject listObj = jsonList.getJSONObject(i);
			String title = listObj.getString("title");
			String url = listObj.getString("url");
			boolean draft = listObj.getBoolean("draft");
			
			System.out.println(title);
			System.out.println(url);
			System.out.println(draft);
			System.out.println();
		}
	}

}
