package chaper6;

public class bus {
	
	int busNum;
	int count;
	int money;
	
	public bus(int busNum) {
		this.busNum = busNum;
	}

	public void takeBus(int money) {
		this.money += money;
		count++;
	}
	
	public void showInfo() {
		System.out.println(busNum+"���� ���� �°��� "+count+"���̰�, ������ "+money+"�� �Դϴ�.");
	}
}
