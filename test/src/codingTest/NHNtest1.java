package codingTest;

import java.util.*;

public class NHNtest1 {
	
	public static int[] solution(int size,int[][] array){
		
		int[] answer = {};
		return answer;
	}

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			int size = Integer.parseInt(sc.nextLine().replaceAll("\\s+",""));;
			
			int[][] array = new int[size][size];
			
			for(int i=0; i<size; i++) {
				String[] empty = sc.nextLine().trim().replaceAll("\\s+","").split(" ");
				for(int j=0; j<size; j++) {
					array[i][j] = Integer.parseInt(empty[j]);
				}
			}
			//int[] solution = NHNtest1.solution(size, array);
			
			System.out.println(size);
			
		} catch (NumberFormatException e) {
	    	throw e;
	    } catch (Exception e) {
	    	throw e;
	    }
		

	}

}
