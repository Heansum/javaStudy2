package chapter5;

import java.util.Scanner;

public class Ex2_1 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);

		System.out.print("�� �Է� : ");
		String month = scanf.next();
		
		BirthMonth birthMOnth = BirthMonth.getBirthMonth(month);
		
		BirthMonth[] birthMonthArr = BirthMonth.values();
		
		for(BirthMonth birthMonth : birthMonthArr) {
			// n��° ����� ���� �ִ� �������� XX�� ���ڿ��� ����
			String korMonth = birthMonth.getKorMonth();
			
			if(month.equals(korMonth)) {
				System.out.println(birthMonth + "�� " + korMonth + "�Դϴ�.");
			}
			
		}
		
		
		
	}
}
