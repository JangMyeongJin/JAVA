package chapter4;

public class studentTest {

	public static void main(String[] args) {
		
		Student studentjames = new Student(100, "james");
		studentjames.setKorea(100);
		studentjames.setMath(100);
		
		Student studenttomas = new Student(101, "tomas");
		studenttomas.setKorea(80);
		studenttomas.setMath(60);
		
		studentjames.showStudentInfo();
		studenttomas.showStudentInfo();
		

	}

}
