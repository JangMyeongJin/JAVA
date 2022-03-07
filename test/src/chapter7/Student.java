package chapter7;

import java.util.*;

public class Student {
	
	private int studentID;
	private String studentName;
	
	private ArrayList<Subject> subjectList;
	
	public Student(String studentName, int studentID) {
		this.studentName = studentName;
		this.studentID = studentID;
		
		subjectList = new ArrayList<Subject>();
	}

	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			total += subject.getScore();
			
			System.out.println(studentName + "님의 " + subject.getName() + " 성적은 " + subject.getScore()+"점 입니다.");
		}
		System.out.println(studentName + "님의 총점은" + total + "점 입니다.");
	}
}
