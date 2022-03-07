package test;

import java.util.HashMap;

public class testMap {
	public static void main (String args[]) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		System.out.println(map.get("people")); //key에 해당하는 value값 출력
		System.out.println(map.containsKey("people")); //해당 key값이 있는지 출력
		System.out.println(map.remove("people")); //해당 값 삭제후 해당 value 출력
	}

}
