package codingTest;

import java.util.*;

public class Test8 {

	public static void main(String[] args) {
		//1. 김씨와 이씨는 각각 몇 명 인가요?
		//2. "이재영"이란 이름이 몇 번 반복되나요?
		//3. 중복을 제거한 이름을 출력하세요.
		//4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
		
		int answer1Kim = 0;
		int answer1Lee = 0;
		int answer2 = 0;
		
		String name = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		
		String[] names = name.split(",");
		
		for(int i=0; i<names.length; i++) {
			if(names[i].substring(0,1).equals("이")) {
				answer1Lee += 1;
			}else if(names[i].substring(0,1).equals("김")) {
				answer1Kim += 1;
			}
			
			if(names[i].equals("이재영")) {
				answer2 += 1;
			}
		}
		
		HashSet<String> hashName = new HashSet<>();
		
		for(int i=0; i<names.length; i++) {
			hashName.add(names[i]);
		}
		
		ArrayList<String> listName = new ArrayList<>(hashName);
		
		Collections.sort(listName);
		
		System.out.printf("김씨는 %d명 이씨는 %d명 \n", answer1Kim, answer1Lee);
		System.out.printf("이재영의 반복 횟수는 %d \n", answer2);
		System.out.println(hashName);
		System.out.println(listName);
	}

}
