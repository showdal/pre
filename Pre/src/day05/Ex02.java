package day05;

/*
	����]
		���ĺ� 'O' ���� ���������� ���ڸ� 5���� ���� ����ϼ���.
 */
public class Ex02 {
	public static void main(String[] args) {
		// ���� �����ϰ� �ʱ�ȭ�ϰ�
		char ch = 'O';
		// �ݺ��ؼ� ����ϰ�
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println((char)(ch + i));
		}
	}
}
