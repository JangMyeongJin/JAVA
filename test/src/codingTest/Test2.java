package codingTest;

import java.util.*;

public class Test2 {
	
	public static String solution(String[] participant, String[] completion){
        
        for(int i=0; i<participant.length; i++) {
        	for(int j=0; j<completion.length; j++) {
        		if(participant[i].equals(completion[j])) {
        			participant[i]="";
        			completion[j]="";
        		}
        	}
        	if(!participant[i].equals("")) {
        		participant[0]=participant[i];
        	}
        }
        
        String answer="";
        answer=participant[0];
        return answer;
    }

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		System.out.println(Test2.solution(participant, completion));
	}

}
