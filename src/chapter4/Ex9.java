package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex9 {
	public static void main(String[] args) {
		Set<Passenger> passengerList = new HashSet<>();
		Passenger p1 = new Passenger("홍길동", "010-7591-8524", "이코노미");	
		Passenger p2 = new Passenger("고영희", "010-7591-8524", "이코노미");	
		Passenger p3 = new Passenger("길", "010-7591-8524", "이코노미");	
		Passenger p4 = new Passenger("동", "010-7591-8524", "이코노미");	
		Passenger p5 = new Passenger("홍", "010-7591-8524", "이코노미");	
		
		passengerList.add(p1);
		passengerList.add(p2);
		passengerList.add(p3);
		passengerList.add(p4);
		passengerList.add(p5);
		
		// Iterator를 사용해서 모든 승객의 정보를 출력하세요.
		Iterator<Passenger> iterator = passengerList.iterator();
		while(iterator.hasNext()) {
			Passenger passenger = iterator.next();
			
			System.out.println("이름 : "+ passenger.getName());
			System.out.println("연락처 : " + passenger.getTel());
			System.out.println("좌석등급 : " + passenger.getSeat());
			
			
			
			
			
			
			
		}
	}
}
