package chapter07;

public class CalcultaorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		Calc calc = new CompleteCalc();
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.divibe(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		
	}

}
