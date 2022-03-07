package chaper6;

public class TakeTrans {

	public static void main(String[] args) {
		
		student james = new student("james",5000);
		student tomas = new student("tomas",10000);
		
		bus bus100 = new bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		subway subway2 = new subway(2);
		tomas.takeSubway(subway2);
		tomas.showInfo();
		subway2.showInfo();

	}

}
