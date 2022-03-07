package proten;

public class Test4 {

	public static void main(String[] args) {
		int sum=0;
		
		
		for(int i=2; i<101; i++) {
			int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count+=1;
				}
			}
			if(count == 2) {
				sum+=i;
			}
		}
		System.out.println("1부터 100까지 소수의 합은 "+sum);
	}

}
