package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex9 {
	public static void main(String[] args) {
		Set<Passenger> passengerList = new HashSet<>();
		Passenger p1 = new Passenger("ȫ�浿", "010-7591-8524", "���ڳ��");	
		Passenger p2 = new Passenger("����", "010-7591-8524", "���ڳ��");	
		Passenger p3 = new Passenger("��", "010-7591-8524", "���ڳ��");	
		Passenger p4 = new Passenger("��", "010-7591-8524", "���ڳ��");	
		Passenger p5 = new Passenger("ȫ", "010-7591-8524", "���ڳ��");	
		
		passengerList.add(p1);
		passengerList.add(p2);
		passengerList.add(p3);
		passengerList.add(p4);
		passengerList.add(p5);
		
		// Iterator�� ����ؼ� ��� �°��� ������ ����ϼ���.
		Iterator<Passenger> iterator = passengerList.iterator();
		while(iterator.hasNext()) {
			Passenger passenger = iterator.next();
			
			System.out.println("�̸� : "+ passenger.getName());
			System.out.println("����ó : " + passenger.getTel());
			System.out.println("�¼���� : " + passenger.getSeat());
			
			
			
			
			
			
			
		}
	}
}
