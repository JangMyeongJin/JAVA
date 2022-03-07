package jsonTest;

import org.json.JSONObject;

public class jsonElastic {

	public static void jsonElastic() {
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
		JSONObject jObject = new JSONObject(jsonString);
		JSONObject source = jObject.getJSONObject("_source");
		
		String modifyUser = source.getString("modifyUser");
		int modifyDate = source.getInt("modifyDate");
		String synonyms = source.getString("synonyms");
		String word = source.getString("word");
		
		System.out.println(modifyUser);
		System.out.println(modifyDate);
		System.out.println(synonyms);
		System.out.println(word);
	}
}
