package codingTest;

import java.util.*;

public class Test6 {
	static HashMap<Integer,Integer> count = new HashMap<>();
	
	public static void countPut(int num) {
		if(count.containsKey(num)) {
			count.replace(num, count.get(num)+1);
		}else {
			count.put(num, 1);
		}
	}

	public static void main(String[] args) {
		
		for(int i=0; i<1001; i++) {
			if((int)Math.log10(i)+1 == 4) {
				int a = i/1000;
				int b = (i/100)%10;
				int c = (i/10)%10;
				int d = i%10;
				Test6.countPut(a);
				Test6.countPut(b);
				Test6.countPut(c);
				Test6.countPut(d);
			}else if((int)Math.log10(i)+1 == 3) {
				int b = i/100;
				int c = (i/10)%10;
				int d = i%10;
				Test6.countPut(b);
				Test6.countPut(c);
				Test6.countPut(d);
			}else if((int)Math.log10(i)+1 == 2) {
				int c = i/10;
				int d = i%10;
				Test6.countPut(c);
				Test6.countPut(d);
			}else {
				int d = i%10;
				Test6.countPut(d);
			}
		}
		
		System.out.println(count);

	}

}
