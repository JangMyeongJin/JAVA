package chapter7;

public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student("kim",1001);
		kim.addSubject("����", 98);
		kim.addSubject("����", 82);
		kim.showStudentInfo();
		System.out.println();
		
		Student lee = new Student("lee",1002);
		lee.addSubject("����", 73);
		lee.addSubject("����", 90);
		lee.addSubject("����", 82);
		lee.showStudentInfo();

	}

}
