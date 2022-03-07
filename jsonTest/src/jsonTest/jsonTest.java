package jsonTest;

import org.json.JSONObject;

public class jsonTest {
	
	public static void jsonTest(){
		String jsonString = "{   "
				+ "  'title': 'PROTEN',   "
				+ "  'url': 'http://m.proten.co.kr/',   "
				+ "  'draft': true,   "
				+ "  'star': 10   "
				+ "}";
	
		JSONObject jobj = new JSONObject(jsonString);
	
		String title = jobj.getString("title");
		System.out.println(title);
	}
}
