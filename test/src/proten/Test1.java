package proten;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d*%d=%d  ", m, i, m*i);
			if(i%n ==0) {
				System.out.println();
			}
		}

	}

}
