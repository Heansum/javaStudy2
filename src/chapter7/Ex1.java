package chapter7;

public class Ex1 {
	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread());
		
		// ������� 1ȸ���̴�
		thread.start();

		thread = new Thread(new MyThread());
		thread.start();
		
	}
}
