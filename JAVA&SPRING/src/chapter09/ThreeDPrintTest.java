package chapter09;

public class ThreeDPrintTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		
		ThreeDPrinter3 print = new ThreeDPrinter3();
		
		print.setMeterial(powder);
		
		Powder p = (Powder)print.getMeterial(); //자료형 변환을 해주어야함
		
		
	}

}
