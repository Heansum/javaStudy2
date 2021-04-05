package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex4_01ex {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("C:\\Users\\ITPS\\Desktop\\output.txt");
			
			// �ش� ��Ʈ���� ����� ���Ͽ� a ~ z ���� �����ϼ���.
			// my answer
//			for(int i = 97; i<=122; i++) {
//				int data = i;
//				fos.write(data);
//				System.out.println(data);
//			}
			
			for(byte i='A'; i<='Z'; i++) {
				fos.write(i);
				fos.write('\n');
			}
	
		
		} catch(FileNotFoundException e ) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		} catch(IOException e) {
			System.out.println("������ �߻��߽��ϴ�.");
		}
		finally {
			
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
}
