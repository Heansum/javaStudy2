package chapter4;

public class Ex6_1 {
	public static void main(String[] args) {
		Passenger p1 = new Passenger("ȫ�浿", "010-7591-8524", "���ڳ��");	// �ν��Ͻ��� ������ �ִ� ���� ����ڵ�� �����;��Ѵ�
		Passenger p2 = new Passenger("ȫ�浿", "010-7591-8524", "���ڳ��");
		
		boolean same = p1.hashCode() == p2.hashCode();	// �ν��Ͻ��� ������ �ִ� ���� ����� �޸��ּҸ� �������
		if(same) {
			System.out.println("p1�� p2�� �����ϴ�");
		} else {
			System.out.println("p1�� p2�� �ٸ��ϴ�.");
		}
				
	}
}
