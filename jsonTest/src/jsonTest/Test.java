package jsonTest;

import org.json.JSONObject;

public class Test {
	
	public static void Test() {
		String jsonString = "{   "
				+ "  'title': 'PROTEN',   "
				+ "  'url': 'http://m.proten.co.kr/',   "
				+ "  'draft': true,   "
				+ "  'star': 10   "
				+ "}";
		
		JSONObject jObj = new JSONObject(jsonString);
		
		String title = jObj.getString("title");
		System.out.println(title);
	}

}
