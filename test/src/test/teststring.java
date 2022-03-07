package test;

public class teststring {
	public static void main(String args[]) {
		String a = "java";
		String b = "hi";
		String c = "java";
		String d = new String("java");
		
		System.out.println(a.equals(b)); //equals는 문자열 2개 비교
		System.out.println(a.equals(c)); 
		System.out.println(a==d);
		System.out.println(a.equals(d)); //a와b는 값은 같지만 서로 다른 객체
		
		String e = "hello java";
		System.out.println(e.indexOf("java")); //특정 문자가 시작되는 지점
		System.out.println(e.replaceAll("java","world")); //특정 문자열을 다른 문자로 바꿈
		System.out.println(e.substring(0,5)); //문자열 중 특정 부분 출력
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("Hi");
		sb.insert(0, "world "); //insert를 이용하여 문자열 삽입
		System.out.println(sb); //StringBuffer를 이용하여 문자열 추가
		
		String temp = "";
		temp += "hello";
		temp += " ";
		temp += "world";
		System.out.println(temp); //String으로 문자열 추가
		
		
		
	}
}
