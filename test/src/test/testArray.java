package test;

import java.util.ArrayList;

public class testArray {
	public static void main (String args[]) {
		int[] num = {1,3,5,7,9};
		String[] weeks = {"��","ȭ","��","��","��","��","��"}; //����Ʈ�� ������ �ڷ��� ����
		System.out.println(weeks);
		
		String[] weeks1 = new String[7];
		weeks1[0] = "��";
		weeks1[1] = "ȭ";
		weeks1[2] = "��";
		weeks1[3] = "��";
		weeks1[4] = "��";
		weeks1[5] = "��";
		weeks1[6] = "��"; //����Ʈ ����� ����
		System.out.println(weeks1);
		
		for (int i=0; i<weeks.length; i++) {
			System.out.println(weeks[i]);
		}
		
		ArrayList<String> test = new ArrayList<String>();
		test.add("111");
		test.add("222");
		test.add(0, "333");
		System.out.println(test);
		System.out.println(test.get(1)); //Ư�� �ε����� ���
		System.out.println(test.size()); //ArrayList ���� ���
		System.out.println(test.contains("222")); //����Ʈ�ȿ� �ش� ���� �ִ��� ���
		System.out.println(test.remove("111")); //�ش� ���� �����ϰ� ������ ��� ���
		System.out.println(test.remove(0)); //�ش� �ε����� �����ϰ� ������ �ε��� ���
		
	}

}
