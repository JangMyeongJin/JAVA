package codingTest;

public class Test4 {

	public static void main(String[] args) {
		int answer = 0;
		for(int i=0; i<1001; i++) {
			if(i%3 ==0 || i%5 ==0) {
				answer+=i;
			}
		}
		System.out.println(answer);
	}

}
