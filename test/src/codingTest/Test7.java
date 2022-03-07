package codingTest;

public class Test7 {
	
	static int count=0;
	
	public static void counting(int num) {
		if(num==8) {
			count +=1;
		}
	}

	public static void main(String[] args) {
		
		for(int i=0; i<10001; i++) {
			if((int)Math.log10(i)+1 == 4) {
				Test7.counting(i/1000);
				Test7.counting((i/100)%10);
				Test7.counting((i/10)%10);
				Test7.counting(i%10);
			}else if((int)Math.log10(i)+1 == 3) {
				Test7.counting((i/100)%10);
				Test7.counting((i/10)%10);
				Test7.counting(i%10);
			}else if((int)Math.log10(i)+1 == 2) {
				Test7.counting((i/10)%10);
				Test7.counting(i%10);
			}else {
				Test7.counting(i%10);
			}
		}
		System.out.println(count);
	}

}
