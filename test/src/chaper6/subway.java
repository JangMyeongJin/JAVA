package chaper6;

public class subway {
	
	int subwayNum;
	int count;
	int money;
	
	public subway(int subwayNum) {
		this.subwayNum = subwayNum;
	}

	public void takeSubway(int money) {
		this.money += money;
		count++;
	}
	
	public void showInfo() {
		System.out.println(subwayNum+"���� ����ö �°��� "+count+"���̰�, ������ "+money+"�� �Դϴ�.");
	}

}
