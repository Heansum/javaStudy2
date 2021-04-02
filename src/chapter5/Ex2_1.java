package chapter5;

import java.util.Scanner;

public class Ex2_1 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);

		System.out.print("월 입력 : ");
		String month = scanf.next();
		
		BirthMonth birthMOnth = BirthMonth.getBirthMonth(month);
		
		BirthMonth[] birthMonthArr = BirthMonth.values();
		
		for(BirthMonth birthMonth : birthMonthArr) {
			// n번째 상수가 갖고 있는 데이터인 XX월 문자열을 저장
			String korMonth = birthMonth.getKorMonth();
			
			if(month.equals(korMonth)) {
				System.out.println(birthMonth + "은 " + korMonth + "입니다.");
			}
			
		}
		
		
		
	}
}
