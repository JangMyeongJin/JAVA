package codeTest;

public class Test4 {
	
	public static void main(String[] args) {
		
		//�迭�� ����
		int[] num2 = new int[7]; 
		
		//�迭����
		int[] num = new int[] {1,2,3,4,5};
		int[] num1 = {1,2,3,4,5};
		 
		//�迭 ��ü
		int[] temp = new int[7];
		
		for(int i=0; i<num.length; i++) {
			temp[i] = num[i];
		}
		for(int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
	}

}
