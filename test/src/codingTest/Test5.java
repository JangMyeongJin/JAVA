package codingTest;

import java.util.*;

public class Test5 {
	
	public static int Generated(int num) {
		
		int sumGenerator=0;
		int numCopy = num;
		
		while(num>0) {
			sumGenerator += num % 10;
			num /= 10;
		}
		
		sumGenerator = sumGenerator + numCopy;
		
		return sumGenerator;
	}

	public static void main(String[] args) {
		boolean[] sumGenerator = new boolean[5000];
		
		int answer=0;
		
		for(int i=0; i<5001; i++) {
			int num = Test5.Generated(i);
			
			if(num<5000) {
				sumGenerator[num] = true;
			}
		}
		
		for(int i=0; i<sumGenerator.length; i++) {
			if(sumGenerator[i]==false) {
				answer += i;
			}
		}
		
		System.out.println(answer);
	}

}
