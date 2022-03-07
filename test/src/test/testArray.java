package test;

import java.util.ArrayList;

public class testArray {
	public static void main (String args[]) {
		int[] num = {1,3,5,7,9};
		String[] weeks = {"월","화","수","목","금","토","일"}; //리스트를 만들대는 자료형 선언
		System.out.println(weeks);
		
		String[] weeks1 = new String[7];
		weeks1[0] = "월";
		weeks1[1] = "화";
		weeks1[2] = "수";
		weeks1[3] = "목";
		weeks1[4] = "금";
		weeks1[5] = "토";
		weeks1[6] = "일"; //리스트 선언과 같음
		System.out.println(weeks1);
		
		for (int i=0; i<weeks.length; i++) {
			System.out.println(weeks[i]);
		}
		
		ArrayList<String> test = new ArrayList<String>();
		test.add("111");
		test.add("222");
		test.add(0, "333");
		System.out.println(test);
		System.out.println(test.get(1)); //특정 인덱스값 출력
		System.out.println(test.size()); //ArrayList 갯수 출력
		System.out.println(test.contains("222")); //리스트안에 해당 값이 있는지 출력
		System.out.println(test.remove("111")); //해당 값을 삭제하고 삭제한 결과 출력
		System.out.println(test.remove(0)); //해당 인덱스를 삭제하고 삭제한 인덱스 출력
		
	}

}
