package codingTest;

import java.util.*;

public class Test10 {

	public static void main(String[] args) {
		//1. 김씨와 이씨는 각각 몇 명 인가요?
		//2. "이재영"이란 이름이 몇 번 반복되나요?
		//3. 중복된 이름을 출력하세요.
		//4. 중복을 제거한 이름을 내림차순으로 정렬하여 출력하세요.
		
		int answer1Kim = 0;
		int answer1Lee = 0;
		int answer2 = 0;
		
		String name = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";

		String[] names = name.split(",");
		
		for(int i=0; i<names.length; i++) {
			if(names[i].substring(0,1).equals("김")) {
				answer1Kim += 1;
			}else if(names[i].substring(0,1).equals("이")) {
				answer1Lee += 1;
			}
			if(names[i].equals("이재영")) {
				answer2 = 0;
			}
		}
		
		HashSet<String> HashName = new HashSet<>();
		boolean[] checkName = new boolean[names.length];
		
		for(int i=0; i<names.length; i++) {
			HashName.add(names[i]);
			if(HashName.add(names[i])) {
				checkName[i] = true;
			}
		}
		/*for(int i=0; i<names.length; i++) {
			if(checkName[i]==false) {
				System.out.println(names[i]);
			}
		}*/
		System.out.println(Arrays.toString(checkName));
	}

}
