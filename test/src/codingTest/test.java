package codingTest;

import java.util.*;

public class test {

	public static void main(String[] args) {
		HashMap<Integer,Integer> a = new HashMap<>();
		
		int[][] b = {{1,2,6},{1,4,5},{6,7,8,9}};
		
		int c=0;
		
		for(int i=0; i<b.length; i++){
			for(int j=0; j<b[i].length; j++) {
				
				if(a.containsKey(b[i][j])) {
					a.replace(b[i][j], a.get(b[i][j])+1);
				}else {
				
				a.put(b[i][j],1);
				}
			}
		}
		c+=Collections.max(a.values());
		System.out.println(c);
	}

}
