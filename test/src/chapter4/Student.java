package chapter4;

public class Student {
	
	int studentId;
	String studentName;
	Subject korea;
	Subject math;
	
/*	public Student() {
		korea = new Subject("국어");
		math = new Subject("수학");
	}*/
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	
	public void setKorea(int score) {
		korea.setScore(score);
	}
	
	public void setMath(int score) {
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName+" 학생의 총점은 "+total+" 점 입니다.");
	}
}
