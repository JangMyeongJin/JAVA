package codingTest;

import java.util.*;

public class Test10 {

	public static void main(String[] args) {
		//1. �达�� �̾��� ���� �� �� �ΰ���?
		//2. "���翵"�̶� �̸��� �� �� �ݺ��ǳ���?
		//3. �ߺ��� �̸��� ����ϼ���.
		//4. �ߺ��� ������ �̸��� ������������ �����Ͽ� ����ϼ���.
		
		int answer1Kim = 0;
		int answer1Lee = 0;
		int answer2 = 0;
		
		String name = "������,���翵,����ǥ,���翵,�ڹ�ȣ,������,���翵,������,�ֽ���,�̼���,�ڿ���,�ڹ�ȣ,������,����ȯ,���缺,������,������";

		String[] names = name.split(",");
		
		for(int i=0; i<names.length; i++) {
			if(names[i].substring(0,1).equals("��")) {
				answer1Kim += 1;
			}else if(names[i].substring(0,1).equals("��")) {
				answer1Lee += 1;
			}
			if(names[i].equals("���翵")) {
				answer2 = 0;
			}
		}
		
		HashSet<String> HashName = new HashSet<>();
		boolean[] checkName = new boolean[names.length];
		
		for(int i=0; i<names.length; i++) {
			HashName.add(names[i]);
			if(HashName.add(names[i])) {
				checkName[i] = true;
			}
		}
		/*for(int i=0; i<names.length; i++) {
			if(checkName[i]==false) {
				System.out.println(names[i]);
			}
		}*/
		System.out.println(Arrays.toString(checkName));
	}

}
