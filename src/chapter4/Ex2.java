package chapter4;

import java.util.ArrayList;
import java.util.List;

//List<Integer> intList = new ArrayList<>();
//for (int i=1;i<=10;i++) {
//	intList.add(i);
//}
public class Ex2 {
	public static void main(String[] args) {
		
		// ArrayList, LinkedList, stack, vector 등...
		// ArrayList 특징 - 중간에 삽입, 삭제가 빈번한 상황에서는 부적합한 자료구조
//						  맨 뒤에서 삽입, 삭제가 빈번한 상황에서는 적합한 자료구조
//		
//		
//		
//		
//		arrayList = new LinkedList<>();
		
//		ArrayList<String> arrList = new ArrayList<>();
//		arrList = new LinkedList<>();
		
		Passenger passenger1 = new Passenger("홍길동", "010-1473-3698", "이코노미");
		Passenger passenger2 = new Passenger("nick", "010-1473-3698", "이코노미");
		Passenger passenger3 = new Passenger("john", "010-1473-3698", "이코노미");
		Passenger passenger4 = new Passenger("michel", "010-1473-3698", "이코노미");
		Passenger passenger5 = new Passenger("liam", "010-1473-3698", "이코노미");
		
		
		List<Passenger> passengerList = new ArrayList<>();
		passengerList.add(passenger1);
		passengerList.add(passenger2);
		passengerList.add(passenger3);
		passengerList.add(passenger4);
		passengerList.add(passenger5);
//		System.out.println("초기 상태 : " + passengerList);
//		
		
//		
//		
//		Passenger passenger0 = new Passenger("메튜", "010-7591-1534", "이코노미");
//		
//		System.out.println("전 = " + passenger1);
//		
//		passengerList.add(0, passenger0);
//		
//		System.out.println("후 = " + passengerList);
//		// 이름 - 메튜
//		// 연락처 - 010-7591-1534
//		// 등급 - 이코노미
//		
		
		passengerList.remove(0);
		System.out.println(passengerList);
		
		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		System.out.println("초기 상태 : " + arrayList);
		
		List<Integer> intList = new ArrayList<>();
		for (int i=1;i<=10;i++) {
			intList.add(i);
		}
		System.out.println("초기 상태 : " + intList);
		
		arrayList.add(1, "B");
		System.out.println("인덱스 1 위치에 B 추가 : " + arrayList);
		
		
		arrayList.add(3, "D");
		System.out.println("인덱스 3 위치에 D 추가 : " + arrayList);
		
		arrayList.remove(2);
		System.out.println("인덱스 2 위치의 값 삭제 : " + arrayList);
		
		arrayList.remove(4);
		System.out.println("인덱스 4 위치의 값 삭제 : " + arrayList);
		
		System.out.println("인덱스 2 위치의 값 반환 : " + arrayList.get(2));
		System.out.println("인덱스 3 출력 : " + arrayList.get(3));
		
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

		
		// 비어있나요? -> true / 그렇지 않으면 false
		System.out.println(passengerList.isEmpty());
		
		// 컬렉션 프레임워크에 들어있는 데이터의 개수를 반환
		System.out.println(passengerList.size());
		
		// i가 X로 시작해서 X로 끝난다.
		for(int i=0; i<passengerList.size(); i++) {
			System.out.println(passengerList.get(i));
		}
		
		// 향상된 for문 / foreach문
		for(Passenger p : passengerList) {
			System.out.println(p);
		} // end for
		
		int[] arr = {1, 2, 3, 4, 5};
		for(int i : arr) {
			System.out.println(i);
		}
	
	
	
	}
}
