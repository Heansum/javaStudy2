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
			System.out.println("������ ã�� ���߽��ϴ�.");
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("��Ʈ���� �ݴ� ���� ������ �߻��߽��ϴ�.");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("���α׷� ����");
		}
	}
}
