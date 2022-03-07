package codeTest;

public class Test3 {

	public static void main(String[] args) {
		
		for(int y=0; y<9; y++) {
			for(int x=0; x<9; x++) {
				if(y==2 && x==4) {
					System.out.printf("%c", '¡Û');
				}else if(x==0 && y==0) {
					System.out.printf("%c", '¦£');
				}else if(x==8 && y==0) {
					System.out.printf("%c", '¦¤');
				}else if(x==0 && y==8) {
					System.out.printf("%c", '¦¦');
				}else if(x==8 && y==8) {
					System.out.printf("%c", '¦¥');
				}else if(y==0) {
					System.out.printf("%c", '¦¨');
				}else if(y==8) {
					System.out.printf("%c", '¦ª');
				}else if(x==0) {
					System.out.printf("%c", '¦§');
				}else if(x==8) {
					System.out.printf("%c", '¦©');
				}
				else {
					System.out.printf("%c", '¦«');
				}
			}
			System.out.println();
		}

	}

}
