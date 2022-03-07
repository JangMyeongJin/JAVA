package jsonTest;

import org.json.JSONObject;

public class jsonNet {

	public static void jsonNet() {
		String jsonString = "{   "
				+ "  'title': 'PROTEN',   "
				+ "  'url': 'http://m.proten.co.kr/',   "
				+ "  'draft': true,   "
				+ "  'star': 10   "
				+ "}";
		JSONObject jobject = new JSONObject(jsonString);
		
		String title = jobject.getString("title");
		String url = jobject.getString("url");
		boolean draft = jobject.getBoolean("draft");
		int star = jobject.getInt("star");
		System.out.println(title);
		System.out.println(url);
		System.out.println(draft);
		System.out.println(star);
	}
}
