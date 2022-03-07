package jsonTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestJson {
	
	public static String TestJson(JSONObject jsonString) {
		
		String jsonTitle = jsonString.getString("title");
		
		return jsonTitle;
	}
	
	
	 public static String TestJson2(JSONObject jsonString2) {
	  
	 JSONObject jObjectObject = jsonString2.getJSONObject("jsonMap3");
	  
	 String title = jObjectObject.getString("tail");
	  
	 return title; 
	 }
	 
	
	 public static Object TestJson3(JSONObject jsonString3) {
	 
	 JSONArray List2JsonObj = jsonString3.getJSONArray("List2");
	 
	 for(int i=0; i<List2JsonObj.length(); i++) {
		 JSONObject jsonObj = List2JsonObj.getJSONObject(i);
		 
		 String title = jsonObj.getString("title");
		 
		 if(title.equals("testMap2Title")) {
			 return title;
		 }
	 }
	 return "";
			 
	 }
	 
	
	public static void main(String[] args) {
		HashMap<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("title", "testMapTitle");
		jsonMap.put("body", "testMapBody");
		jsonMap.put("tail", "testMapTail");
		
		JSONObject jsonString = new JSONObject(jsonMap);
		System.out.println(TestJson(jsonString));
		
		HashMap<String, Object> jsonMap2 = new HashMap<String, Object>();
		jsonMap2.put("title", "testMap2Title");
		jsonMap2.put("body", "testMap2Body");
		jsonMap2.put("tail", "testMap2Tail");
		HashMap<String, Object> jsonMap3 = new HashMap<String, Object>();
		jsonMap3.put("title", "testMap3Title");
		jsonMap3.put("body", "testMap3Body");
		jsonMap3.put("tail", "testMap3Tail");
		
		HashMap<String, HashMap<String, Object>> jsonMapMap = new HashMap<String, HashMap<String, Object>>();
		jsonMapMap.put("jsonMap", jsonMap);
		jsonMapMap.put("jsonMap2", jsonMap2);
		jsonMapMap.put("jsonMap3", jsonMap3);
		
		JSONObject jsonString2 = new JSONObject(jsonMapMap);
		
		System.out.println(TestJson2(jsonString2));
		
		List<Map<String, Object>> jsonListMap = new ArrayList<Map<String, Object>>();
		jsonListMap.add(jsonMap);
		jsonListMap.add(jsonMap2);
		jsonListMap.add(jsonMap3);
		
		HashMap<String, List<Map<String, Object>>> jsonMapListMap = new HashMap<String, List<Map<String, Object>>>();
		jsonMapListMap.put("List1", jsonListMap);
		jsonMapListMap.put("List2", jsonListMap);
		jsonMapListMap.put("List3", jsonListMap);
		
		JSONObject jsonString3 = new JSONObject(jsonMapListMap);
		
		System.out.println(TestJson3(jsonString3));
	}

}
