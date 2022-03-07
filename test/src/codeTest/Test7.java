package codeTest;

import java.util.Arrays;
import java.util.Random;

public class Test7 {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = rand.nextInt(44)+1;
		}
		
		System.out.println(Arrays.toString(lotto));

	}

}
