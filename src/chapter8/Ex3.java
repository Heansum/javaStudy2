package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex3 {
	public static void main(String[] args) {
		// ���ڸ� ���ڿ��� �������ָ� ���ڷ� ���޹��� ��ο� �ִ� ���ϰ� ��Ʈ���� ����
		// ������ : �ֻ��� ��θ� ������ ������ ��ġ / �ֻ��� ��κ��� �ش� ��ġ���� ������ ã��
		// ����� : �ֻ��� ��θ� ������ ������ ��ġ / ���� ���α׷��� ����Ǵ� ��ġ���� �ش� ��ġ���� ������ ã��
		
		FileInputStream fis = null;		// �ɰ��� ����
		
		try {
			String path = "D:\\eclipse-workspace\\2021-03-29\\src\\chapter8\\Ex3.java";
			fis = new FileInputStream(path);	// ������ -> ����ȭ�鿡 �ִ°� �����
			
			while(true) {
				int data = fis.read();	// ���� �����͸� �޾Ƶ��϶� �ƽ�Ű�ڵ�� �޾Ƶ��δ�.
				if(data == -1) {
					break;
				}
				
				char c = (char) data;	// �޾ƿ� �ƽ�Ű�ڵ带 ���� �����ͷ� ��ȯ��Ų��.
				System.out.print(c);
			}
			
				// ������ �ݴ°� ��¥ �߿��ϴ�!!
		} catch(FileNotFoundException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		} catch (IOException e) {
			System.out.println("��Ʈ���� �ݴ� ���� ������ �߻��߽��ϴ�.");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("���α׷� ��");
		
	}
}
