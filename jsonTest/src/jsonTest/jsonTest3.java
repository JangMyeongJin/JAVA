package jsonTest;

import org.json.JSONObject;

public class jsonTest3 {
	
	public static void jsonTest3() {
		String jsonString = "{ "
				+ "  'age': '20', "
				+ "  'name': 'jjy', "
				+ "  'student2': { "
				+ "    'age': 21, "
				+ "    'name': 'galid' "
				+ "  } "
				+ "}";
		
		JSONObject jsonObj = new JSONObject(jsonString);
		JSONObject jsonStudent2 = jsonObj.getJSONObject("student2");
		
		 int age = jsonStudent2.getInt("age"); 
		 String name = jsonStudent2.getString("name");
		
		 System.out.println(age); 
		 System.out.println(name);
		 
	}

}
