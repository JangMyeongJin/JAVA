package staticex;

public class studentTest1 {

	public static void main(String[] args) {
		
		System.out.println(Student.getSerialNum());
		Student james = new Student();
		Student tomas = new Student();
		
		System.out.println(james.studentID);
		System.out.println(tomas.studentID);

	}

}
