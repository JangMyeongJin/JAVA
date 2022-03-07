package jsonTest;

import org.json.JSONObject;

public class Test3 {
	
	public static void Test3() {
		String jsonString = "{ "
				+ "  'age': '20', "
				+ "  'name': 'jjy', "
				+ "  'student2': { "
				+ "    'age': 21, "
				+ "    'name': 'galid' "
				+ "  } "
				+ "}";
		
		JSONObject JsonObj = new JSONObject(jsonString);
		
		JSONObject JsonObjStudent2 = JsonObj.getJSONObject("student2");
		
		String name = JsonObjStudent2.getString("name");
		System.out.println(name);
	}

}
