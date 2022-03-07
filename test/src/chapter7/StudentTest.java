package chapter7;

public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student("kim",1001);
		kim.addSubject("국어", 98);
		kim.addSubject("수학", 82);
		kim.showStudentInfo();
		System.out.println();
		
		Student lee = new Student("lee",1002);
		lee.addSubject("국어", 73);
		lee.addSubject("수학", 90);
		lee.addSubject("영어", 82);
		lee.showStudentInfo();

	}

}
