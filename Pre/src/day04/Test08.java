package day04;

import java.util.*;
public class Test08 {
	public static void main(String[] args) {
		// 1. �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// 2. �޼��� ����ϰ�
		System.out.println("������ �Է��ϼ���! : ");
		// 3. �Էµ����� �޾Ƽ� ������ ���
		int no = sc.nextInt();
		// 4. �Ǻ��ϰ�
		String str = "";
		if(no % 2 == 0) {
			if(no < 0) {
				str = "���� ¦��";
			}else {
				str = "���� ¦��";
			}
		} else {
			str = "Ȧ��";
		}
		// 5. ����ϰ�
		System.out.println("�Էµ� ���� [ " + no + " ] �� " + str +"�Դϴ�.");
	}
}
