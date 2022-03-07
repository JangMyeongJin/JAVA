package chapter01;

public class ch01 {

	public static void main(String[] args) {
		
		byte bnum = -128; //byte 자료형은 -128 ~ 127까지 표현 가능
		System.out.println(bnum);
		
		
		int inum = 1234567890; //int 자료형은 10자리까지 표현 가능
		System.out.println(inum);
		
		long lnum = 12345678900L; //10자리 이상은 long 자료형으로 표현(끝에 'L'을 붙어야함)
		System.out.println(lnum);
		
		double dnum = 3.14; //double 자료형은 실수
		System.out.println(dnum);
		
		float fnum = 3.14f; //float 자료형 사용할때는 끝에 'f'
		System.out.println(fnum);
		
		

	}

}
