package day03;

public class Casting1 {
	public static void main(String[] args) {
		float num1 = 10;
		/*
		float num2 = 10.;
		*/
		// 1. 강제 형변환
		float num2 = (float) 10.;
		// 2. 리터럴 형변환
		float num3 = 10.F;
		System.out.println("num1 : " + num1);
		
		// float 타입의 변수 area에 반지름이 5인 원의 넓이를 저장하세요.
		
		float area =  (float) (5 * 5 * 3.14);
		float area1 = 5 * 5 * 3.14f;
	}
}
