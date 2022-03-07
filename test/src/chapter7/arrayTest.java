package chapter7;

public class arrayTest {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		int size=0;
		
		nums[0] = 10; size++;
		nums[1] = 20; size++;
		nums[2] = 30; size++;
		
		//array의 모든값
		int total = 1;
		for(int i=0; i<nums.length; i++) {
			total *= nums[i];
		}
		System.out.println(total);
		
		//array의 값이 있는 모든값
		int total2 = 1;
		for(int i=0; i<size; i++) {
			total2 *= nums[i];
		}
		System.out.println(total2);

	}

}
