package test;

import java.util.HashMap;

public class testMap {
	public static void main (String args[]) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people", "���");
		map.put("baseball", "�߱�");
		System.out.println(map.get("people")); //key�� �ش��ϴ� value�� ���
		System.out.println(map.containsKey("people")); //�ش� key���� �ִ��� ���
		System.out.println(map.remove("people")); //�ش� �� ������ �ش� value ���
	}

}
