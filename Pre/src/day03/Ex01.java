package day03;

public class Ex01 {
	// �غ��� 7�̰� ���̰� 6�� �ﰢ���� ������ ���ϼ���.
	// ��, ������ ������Ÿ���� float�� �����ϼ���.
	public static void main(String[] args) {
		int width = 7;
		int height = 6;
		float area = width * height * 0.5f;
		float area1 = width * height / 2.f;
		
		float area2 = width * height * (float)0.5;
		System.out.println("�غ��� " + width + "�̰� ���̰� " + height + "�� �ﰢ���� ���̴� " + area + " �Դϴ�.");
	}
}
