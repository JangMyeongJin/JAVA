package test;

public class teststring {
	public static void main(String args[]) {
		String a = "java";
		String b = "hi";
		String c = "java";
		String d = new String("java");
		
		System.out.println(a.equals(b)); //equals�� ���ڿ� 2�� ��
		System.out.println(a.equals(c)); 
		System.out.println(a==d);
		System.out.println(a.equals(d)); //a��b�� ���� ������ ���� �ٸ� ��ü
		
		String e = "hello java";
		System.out.println(e.indexOf("java")); //Ư�� ���ڰ� ���۵Ǵ� ����
		System.out.println(e.replaceAll("java","world")); //Ư�� ���ڿ��� �ٸ� ���ڷ� �ٲ�
		System.out.println(e.substring(0,5)); //���ڿ� �� Ư�� �κ� ���
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("Hi");
		sb.insert(0, "world "); //insert�� �̿��Ͽ� ���ڿ� ����
		System.out.println(sb); //StringBuffer�� �̿��Ͽ� ���ڿ� �߰�
		
		String temp = "";
		temp += "hello";
		temp += " ";
		temp += "world";
		System.out.println(temp); //String���� ���ڿ� �߰�
		
		
		
	}
}
