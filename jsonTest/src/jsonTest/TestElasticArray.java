package jsonTest;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestElasticArray {
	
	public static void TestElasticArray() {
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
		JSONObject JsonObj = new JSONObject(jsonString);
		JSONObject JsonObjHits = JsonObj.getJSONObject("hits");
		JSONArray JsonArrayHits = JsonObjHits.getJSONArray("hits");
		
		for(int i=0; i<JsonArrayHits.length(); i++) {
			JSONObject JsonArrayHitsObj = JsonArrayHits.getJSONObject(i);
			JSONObject JsonSource = JsonArrayHitsObj.getJSONObject("_source");
			
			String createUser = JsonSource.getString("createUser");
			int dicNo = JsonSource.getInt("dicNo");
			String wordUnq = JsonSource.getString("wordUnq");
			
			if(wordUnq.equals("weekend")) {
				System.out.println(wordUnq);
				System.out.println(createUser);
				System.out.println(dicNo);
			}
		}
	}

}
