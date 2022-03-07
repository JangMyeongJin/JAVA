package jsonTest;

import org.json.JSONObject;

public class TestElastic {
	
	public static void TestElastic() {
		String jsonString = "{ "
				+ "	'_index' : '@prosearch_dic', "
				+ "	'_type' : 'doc', "
				+ "	'_id' : '1178', "
				+ "	'_score' : null, "
				+ "	'_source' : { "
				+ "	  'wordSep' : '0', "
				+ "	  'modifyUser' : 'promanager', "
				+ "	  'modifyDate' : 20200113000000000, "
				+ "	  'synonyms' : '¿Ã∫œ,e ∫œ', "
				+ "	  'noindexYn' : 'N', "
				+ "	  'wordUnq' : 'ebook', "
				+ "	  'createUser' : 'promanager', "
				+ "	  'nosearchYn' : 'N', "
				+ "	  'lang' : 'kr', "
				+ "	  'dicNo' : 1178, "
				+ "	  'word' : 'ebook', "
				+ "	  'createDate' : 20200113000000000 "
				+ "	}, "
				+ "	'sort' : [ "
				+ "	  1178 "
				+ "	] "
				+ "  }";
		
		JSONObject JsonObj = new JSONObject(jsonString);
		JSONObject JsonObjSource = JsonObj.getJSONObject("_source");
		
		String modifyUser = JsonObjSource.getString("modifyUser");
		int modifyDate = JsonObjSource.getInt("modifyDate");
		
		System.out.println(modifyUser);
		System.out.println(modifyDate);
	}

}
