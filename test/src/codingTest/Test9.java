package codingTest;

import java.util.*;

public class Test9 {

	public static void main(String[] args) {
		//총건수(m) 한페이지에 보여줄 게시물수(n)을 입력받을 때 생성되야할 페이지수 출력
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		
		int n = sc.nextInt();
		
		int answer = (m-1)/n + 1;
		
		System.out.println(answer);
	}

}
