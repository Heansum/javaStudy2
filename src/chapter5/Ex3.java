package chapter5;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("���� �� ��� 1");
		System.out.println("������ ��� 2");
		System.out.println("���� �Է�: ");
		
		// ȸ�������� ���� �̷� ���� �ڵ�
		
		int genderValue = scanf.nextInt();
		
		try {
			Gender gender = Gender.getGender(genderValue);
			if(gender == Gender.MALE) {
				System.out.println("�����Դϴ�");
			} else {
				System.out.println("�����Դϴ�");
			}
			
		}
		catch(IllegalArgumentException e) {
			System.out.println(genderValue + "��(��) �������� �ʴ� �����Դϴ�.");
		}
		
		
		
		
		
	}
}
