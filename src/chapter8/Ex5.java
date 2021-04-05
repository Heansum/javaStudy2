package chapter8;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			// ��� ��Ʈ��
			fos = new FileOutputStream("C:\\Users\\Itps\\Desktop\\bos.txt");
			// ��� ��Ʈ���� ���� ��Ʈ���� ����
			// ������ �⺻ ������� 8KB
			// ������ ����� 5����Ʈ�� ����
			bos = new BufferedOutputStream(fos, 5);
			
			for(char i='1'; i<='9'; i++) {
				bos.write(i);
			}
			
			bos.flush();	// ��½�Ʈ���� �����ؾ��Ѵ�
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// ������Ʈ���� ������
				// ������Ʈ���� ����� ��� ��Ʈ���� �ڵ����� ������.
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
}
