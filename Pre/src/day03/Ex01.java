package day03;

public class Ex01 {
	// 밑변이 7이고 높이가 6인 삼각형의 면적을 구하세요.
	// 단, 면적의 데이터타입은 float로 저장하세요.
	public static void main(String[] args) {
		int width = 7;
		int height = 6;
		float area = width * height * 0.5f;
		float area1 = width * height / 2.f;
		
		float area2 = width * height * (float)0.5;
		System.out.println("밑변이 " + width + "이고 높이가 " + height + "인 삼각형의 넓이는 " + area + " 입니다.");
	}
}
