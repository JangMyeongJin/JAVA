package codingTest;

import java.util.*;

public class Test8 {

	public static void main(String[] args) {
		//1. �达�� �̾��� ���� �� �� �ΰ���?
		//2. "���翵"�̶� �̸��� �� �� �ݺ��ǳ���?
		//3. �ߺ��� ������ �̸��� ����ϼ���.
		//4. �ߺ��� ������ �̸��� ������������ �����Ͽ� ����ϼ���.
		
		int answer1Kim = 0;
		int answer1Lee = 0;
		int answer2 = 0;
		
		String name = "������,���翵,����ǥ,���翵,�ڹ�ȣ,������,���翵,������,�ֽ���,�̼���,�ڿ���,�ڹ�ȣ,������,����ȯ,���缺,������,������";
		
		String[] names = name.split(",");
		
		for(int i=0; i<names.length; i++) {
			if(names[i].substring(0,1).equals("��")) {
				answer1Lee += 1;
			}else if(names[i].substring(0,1).equals("��")) {
				answer1Kim += 1;
			}
			
			if(names[i].equals("���翵")) {
				answer2 += 1;
			}
		}
		
		HashSet<String> hashName = new HashSet<>();
		
		for(int i=0; i<names.length; i++) {
			hashName.add(names[i]);
		}
		
		ArrayList<String> listName = new ArrayList<>(hashName);
		
		Collections.sort(listName);
		
		System.out.printf("�达�� %d�� �̾��� %d�� \n", answer1Kim, answer1Lee);
		System.out.printf("���翵�� �ݺ� Ƚ���� %d \n", answer2);
		System.out.println(hashName);
		System.out.println(listName);
	}

}
