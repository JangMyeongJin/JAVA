package codingTest;

import java.util.*;

public class Test9 {

	public static void main(String[] args) {
		//�ѰǼ�(m) ���������� ������ �Խù���(n)�� �Է¹��� �� �����Ǿ��� �������� ���
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		
		int n = sc.nextInt();
		
		int answer = (m-1)/n + 1;
		
		System.out.println(answer);
	}

}
