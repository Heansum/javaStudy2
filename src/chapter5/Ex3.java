package chapter5;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("남성 일 경우 1");
		System.out.println("여성일 경우 2");
		System.out.println("성별 입력: ");
		
		// 회원가입을 위한 이런 저런 코드
		
		int genderValue = scanf.nextInt();
		
		try {
			Gender gender = Gender.getGender(genderValue);
			if(gender == Gender.MALE) {
				System.out.println("남성입니다");
			} else {
				System.out.println("여성입니다");
			}
			
		}
		catch(IllegalArgumentException e) {
			System.out.println(genderValue + "은(는) 존재하지 않는 성별입니다.");
		}
		
		
		
		
		
	}
}
