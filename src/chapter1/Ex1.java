package chapter1;
 
import java.util.Scanner;

public class Ex1 {
	static String text = "a";
	
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int val1 = 10;
		int val2 = 1;
		int[] val3 = new int[5];
		
		try {
//			System.out.println(val1 / --val2);
//			
			int index = scanf.nextInt();
			
			if(index < 0 || index >= 4) {
				throw new WrongIndexException("�ε����� 0�̻� 4�̸����θ� �����մϴ�.");
			}
			System.out.println(val3[index]);

			
				
			// ���� �޼����� �м��ϰ�
			// �� ���� ��Ÿ���� catch ������ ó���ϼ���.
			// 1. �� ���� catch ������ ����ó��
			// 2. |�� ���ܵ��� ��� �ϳ��� catch������ ����ó��
			char c = Ex1.text.charAt(0);

			// throw -> ���ܸ� �ǵ������� �߻���Ű�� Ű����
			throw new MyException("MyException �߻�");
			
//			System.out.println("try�� ��");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ������ ������ϴ�.");
			System.out.println("�迭�� ������ ��Ҹ� ����մϴ�.");
			
			System.out.println(e.getMessage());
			
			// ����Ϸ��� �迭�� ������ ��� ���
			System.out.println(val3[val3.length-1]);
		} catch(ArithmeticException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
		  catch(NullPointerException e) {
			System.out.println("NullPointerException");
		} catch(MyException e) {
			System.out.println("�������� ���� �޼��� : " + e.getMessage());
			System.out.println("MyException�߻�");
		} catch(WrongIndexException e) {
			System.out.println("���� �߻�!! �������ּ���");
			System.out.println("WrongIndexException �߻�");
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Finally �ڵ� ����");
			scanf.close();
		}
			
		int result = val1 + val2;
		System.out.println(result);
		
	}
}
