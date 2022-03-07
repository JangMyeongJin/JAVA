package codeTest;

public class Test1 {

	public static void main(String[] args) {
		
		int roof = 5;
		
		for(int i=0; i<roof; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf("%c",'¡Ú');
			}
			System.out.println();
		}
		
		for(int i=0; i<roof; i++) {
			for(int j=5; j>i; j--) {
				System.out.printf("%c",'¡Ú');
			}
			System.out.println();
		}

	}

}
