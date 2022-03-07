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
		System.out.println(subwayNum+"번의 지하철 승객은 "+count+"명이고, 수입은 "+money+"원 입니다.");
	}

}
