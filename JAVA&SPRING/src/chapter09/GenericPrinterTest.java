package chapter09;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		
		powderPrinter.setMeterial(powder);
		
		Powder p = powderPrinter.getMeterial(); //Generic�� ����ϸ� �ڷ��� ��ȯ�� �ʿ����
		
		
	}

}
