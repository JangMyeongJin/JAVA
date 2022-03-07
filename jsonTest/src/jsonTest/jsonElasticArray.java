package jsonTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonElasticArray {

	public static void jsonElasticArray() {
		String jsonString = "{ "
				+ "	  'took' : 1, "
				+ "	  'timed_out' : false, "
				+ "	  '_shards' : { "
				+ "		'total' : 1, "
				+ "		'successful' : 1, "
				+ "		'skipped' : 0, "
				+ "		'failed' : 0 "
				+ "	  }, "
				+ "	  'hits' : { "
				+ "		'total' : 18, "
				+ "		'max_score' : null, "
				+ "		'hits' : [ "
				+ "		  { "
				+ "			'_index' : '@prosearch_dic', "
				+ "			'_type' : 'doc', "
				+ "			'_id' : '1137', "
				+ "			'_score' : null, "
				+ "			'_source' : { "
				+ "			  'wordSep' : '0', "
				+ "			  'modifyUser' : 'promanager', "
				+ "			  'modifyDate' : 20200113000000000, "
				+ "			  'synonyms' : '¿þ½ºÆ®¿ìµå', "
				+ "			  'noindexYn' : 'N', "
				+ "			  'wordUnq' : 'westwood', "
				+ "			  'createUser' : 'promanager', "
				+ "			  'nosearchYn' : 'N', "
				+ "			  'lang' : 'kr', "
				+ "			  'dicNo' : 1137, "
				+ "			  'word' : 'westwood', "
				+ "			  'createDate' : 20200113000000000 "
				+ "			}, "
				+ "			'sort' : [ "
				+ "			  1137 "
				+ "			] "
				+ "		  }, "
				+ "		  { "
				+ "			'_index' : '@prosearch_dic', "
				+ "			'_type' : 'doc', "
				+ "			'_id' : '1136', "
				+ "			'_score' : null, "
				+ "			'_source' : { "
				+ "			  'wordSep' : '0', "
				+ "			  'modifyUser' : 'promanager', "
				+ "			  'modifyDate' : 20200113000000000, "
				+ "			  'synonyms' : 'ÀªÄ¡½º,À£Ä¡½º', "
				+ "			  'noindexYn' : 'N', "
				+ "			  'wordUnq' : 'welchs', "
				+ "			  'createUser' : 'promanager', "
				+ "			  'nosearchYn' : 'N', "
				+ "			  'lang' : 'kr', "
				+ "			  'dicNo' : 1136, "
				+ "			  'word' : 'welchs', "
				+ "			  'createDate' : 20200113000000000 "
				+ "			}, "
				+ "			'sort' : [ "
				+ "			  1136 "
				+ "			] "
				+ "		  }, "
				+ "		  { "
				+ "			'_index' : '@prosearch_dic', "
				+ "			'_type' : 'doc', "
				+ "			'_id' : '1135', "
				+ "			'_score' : null, "
				+ "			'_source' : { "
				+ "			  'wordSep' : '0', "
				+ "			  'modifyUser' : 'promanager', "
				+ "			  'modifyDate' : 20200113000000000, "
				+ "			  'synonyms' : 'À§Å©¾Øµå,À§ÄËµå,À§Äµµå,À§Å©¿£µå', "
				+ "			  'noindexYn' : 'N', "
				+ "			  'wordUnq' : 'weekend', "
				+ "			  'createUser' : 'promanager', "
				+ "			  'nosearchYn' : 'N', "
				+ "			  'lang' : 'kr', "
				+ "			  'dicNo' : 1135, "
				+ "			  'word' : 'weekend', "
				+ "			  'createDate' : 20200113000000000 "
				+ "			}, "
				+ "			'sort' : [ "
				+ "			  1135 "
				+ "			] "
				+ "		  } "
				+ "		] "
				+ "	  } "
				+ "	}";
		JSONObject jObject = new JSONObject(jsonString);
		JSONObject jHits = jObject.getJSONObject("hits");
		JSONArray jHitsArray = jHits.getJSONArray("hits");
		
		for(int i=0; i<jHitsArray.length(); i++) {
			JSONObject obj = jHitsArray.getJSONObject(i);
			JSONObject source = obj.getJSONObject("_source");
			String word = source.getString("word");
			String synonyms = source.getString("synonyms");
			String modifyUser = source.getString("modifyUser");
			int modifyDate = source.getInt("modifyDate");
			String noindexYn = source.getString("noindexYn");
			
			System.out.println(word);
			System.out.println(synonyms);
			System.out.println(modifyUser);
			System.out.println(modifyDate);
			System.out.println(noindexYn);
			System.out.println();
		}
		
	}
}
