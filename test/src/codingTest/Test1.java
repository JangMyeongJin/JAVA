package codingTest;

import java.util.*;

public class Test1 {
	
    public static int[] solution(int[] array, int[][] commands) {
    	
    	int[] answer = new int[commands.length];
    	
    	for(int i=0; i<answer.length; i++) {
			int start = commands[i][0]-1;
			int end = commands[i][1];
			
			int pick = commands[i][2]-1;
			
			int[] range = Arrays.copyOfRange(array, start, end);
			
			Arrays.sort(range);
			
			answer[i] = range[pick];
			
		}
    	
        return answer;
    }
    
    public static void main(String[] args) {
    	
    	int[] array = {1, 5, 2, 6, 3, 7, 4};
    	int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}, {2, 5, 2}};

		int[] answer = Test1.solution(array, commands);
		
		/*for(int i=0; i<commands.length; i++) {
			for(int j=0; j<commands[i].length; j++) {
				System.out.print(commands[i][j]+" ");
			}
			System.out.println();
		}*/
		
		System.out.println(answer);
		//System.out.println(commands.length);
	}
}

