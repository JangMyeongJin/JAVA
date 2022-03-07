package chaper6;

public class student {

	String studentName;
	int grade;
	int money;
	
	public student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(bus bus) {
		bus.takeBus(1000);
		money -= 1000;
	}
	public void takeSubway(subway subway) {
		subway.takeSubway(1000);
		money -= 1000;
	}
	
	public void showInfo() {
		System.out.println(studentName+"¥‘¿« ≥≤¿∫ µ∑¿∫ "+money+"¿‘¥œ¥Ÿ.");
		
	}
}
