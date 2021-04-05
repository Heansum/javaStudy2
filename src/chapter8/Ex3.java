package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex3 {
	public static void main(String[] args) {
		// 인자를 문자열로 전달해주면 인자로 전달받은 경로에 있는 파일과 스트림을 연결
		// 절대경로 : 최상위 경로를 포함한 파일의 위치 / 최상위 경로부터 해당 위치까지 파일을 찾음
		// 상대경로 : 최상위 경로를 생략한 파일의 위치 / 현재 프로그램이 실행되는 위치부터 해당 위치까지 파일을 찾음
		
		FileInputStream fis = null;		// 쪼개서 저장
		
		try {
			String path = "D:\\eclipse-workspace\\2021-03-29\\src\\chapter8\\Ex3.java";
			fis = new FileInputStream(path);	// 절대경로 -> 바탕화면에 있는걸 사용함
			
			while(true) {
				int data = fis.read();	// 문자 데이터를 받아들일때 아스키코드로 받아들인다.
				if(data == -1) {
					break;
				}
				
				char c = (char) data;	// 받아온 아스키코드를 문자 데이터로 변환시킨다.
				System.out.print(c);
			}
			
				// 무조건 닫는게 진짜 중요하다!!
		} catch(FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
		} catch (IOException e) {
			System.out.println("스트림을 닫는 도중 문제가 발생했습니다.");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램 끝");
		
	}
}
