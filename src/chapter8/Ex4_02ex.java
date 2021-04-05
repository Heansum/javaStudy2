package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex4_02ex {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\ITPS\\Desktop\\output.txt");
			
			while(true) {
				int data =fis.read();
				if(data == -1) {
					break;
				}
				
				System.out.print((char)data);
			}
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾지 못했습니다.");
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("스트림을 닫는 도중 문제가 발생했습니다.");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("프로그램 종료");
		}
	}
}
