package chapter4;

public class Ex6_1 {
	public static void main(String[] args) {
		Passenger p1 = new Passenger("홍길동", "010-7591-8524", "이코노미");	// 인스턴스가 가지고 있는 값을 헤시코드로 가져와야한다
		Passenger p2 = new Passenger("홍길동", "010-7591-8524", "이코노미");
		
		boolean same = p1.hashCode() == p2.hashCode();	// 인스턴스가 가지고 있는 값의 헤시의 메모리주소를 가지고옴
		if(same) {
			System.out.println("p1과 p2과 같습니다");
		} else {
			System.out.println("p1과 p2가 다릅니다.");
		}
				
	}
}
