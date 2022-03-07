package chapter4;



public class Q4 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		int sum = sumNum(num1,num2);
		System.out.println(sum);
	}
	
	public static int sumNum(int n1, int n2) {
		int result = n1+n2;
		return result;
	}
}
