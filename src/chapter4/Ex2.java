package chapter4;

import java.util.ArrayList;
import java.util.List;

//List<Integer> intList = new ArrayList<>();
//for (int i=1;i<=10;i++) {
//	intList.add(i);
//}
public class Ex2 {
	public static void main(String[] args) {
		
		// ArrayList, LinkedList, stack, vector ��...
		// ArrayList Ư¡ - �߰��� ����, ������ ����� ��Ȳ������ �������� �ڷᱸ��
//						  �� �ڿ��� ����, ������ ����� ��Ȳ������ ������ �ڷᱸ��
//		
//		
//		
//		
//		arrayList = new LinkedList<>();
		
//		ArrayList<String> arrList = new ArrayList<>();
//		arrList = new LinkedList<>();
		
		Passenger passenger1 = new Passenger("ȫ�浿", "010-1473-3698", "���ڳ��");
		Passenger passenger2 = new Passenger("nick", "010-1473-3698", "���ڳ��");
		Passenger passenger3 = new Passenger("john", "010-1473-3698", "���ڳ��");
		Passenger passenger4 = new Passenger("michel", "010-1473-3698", "���ڳ��");
		Passenger passenger5 = new Passenger("liam", "010-1473-3698", "���ڳ��");
		
		
		List<Passenger> passengerList = new ArrayList<>();
		passengerList.add(passenger1);
		passengerList.add(passenger2);
		passengerList.add(passenger3);
		passengerList.add(passenger4);
		passengerList.add(passenger5);
//		System.out.println("�ʱ� ���� : " + passengerList);
//		
		
//		
//		
//		Passenger passenger0 = new Passenger("��Ʃ", "010-7591-1534", "���ڳ��");
//		
//		System.out.println("�� = " + passenger1);
//		
//		passengerList.add(0, passenger0);
//		
//		System.out.println("�� = " + passengerList);
//		// �̸� - ��Ʃ
//		// ����ó - 010-7591-1534
//		// ��� - ���ڳ��
//		
		
		passengerList.remove(0);
		System.out.println(passengerList);
		
		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		System.out.println("�ʱ� ���� : " + arrayList);
		
		List<Integer> intList = new ArrayList<>();
		for (int i=1;i<=10;i++) {
			intList.add(i);
		}
		System.out.println("�ʱ� ���� : " + intList);
		
		arrayList.add(1, "B");
		System.out.println("�ε��� 1 ��ġ�� B �߰� : " + arrayList);
		
		
		arrayList.add(3, "D");
		System.out.println("�ε��� 3 ��ġ�� D �߰� : " + arrayList);
		
		arrayList.remove(2);
		System.out.println("�ε��� 2 ��ġ�� �� ���� : " + arrayList);
		
		arrayList.remove(4);
		System.out.println("�ε��� 4 ��ġ�� �� ���� : " + arrayList);
		
		System.out.println("�ε��� 2 ��ġ�� �� ��ȯ : " + arrayList.get(2));
		System.out.println("�ε��� 3 ��� : " + arrayList.get(3));
		
		Passenger el1 = passengerList.get(1);
		System.out.println(el1);
		
		Passenger el2 = passengerList.get(2);
		System.out.println(el2);

		Passenger passenger = passengerList.get(1);
		System.out.println(passenger.getName());
		System.out.println(passenger.getSeat());
		System.out.println(passenger.getTel());

		passenger = passengerList.get(2);
		System.out.println(passenger.getName());
		System.out.println(passenger.getSeat());
		System.out.println(passenger.getTel());

		
		// ����ֳ���? -> true / �׷��� ������ false
		System.out.println(passengerList.isEmpty());
		
		// �÷��� �����ӿ�ũ�� ����ִ� �������� ������ ��ȯ
		System.out.println(passengerList.size());
		
		// i�� X�� �����ؼ� X�� ������.
		for(int i=0; i<passengerList.size(); i++) {
			System.out.println(passengerList.get(i));
		}
		
		// ���� for�� / foreach��
		for(Passenger p : passengerList) {
			System.out.println(p);
		} // end for
		
		int[] arr = {1, 2, 3, 4, 5};
		for(int i : arr) {
			System.out.println(i);
		}
	
	
	
	}
}
