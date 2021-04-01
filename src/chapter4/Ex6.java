package chapter4;

public class Ex6 {
	public static void main(String[] args) {
		// 서로 다른 영역의 두 개의 인스턴스 생성
		Passenger p1 = new Passenger("홍길동", "010-7591-8524", "이코노미");
		Passenger p2 = new Passenger("홍길동", "010-7591-8524", "이코노미");
		
		// 두 인스턴스의 이름이 같다
		String p1Name = p1.getName();
		String p2Name = p2.getName();
		boolean nameSame = p1Name.equals(p2Name);
		
		// 두 인스턴스의 연락처가 같다
		String p1Tel = p1.getTel();
		String p2Tel = p2.getTel();
		boolean telSame = p1Tel.equals(p2Tel);
		
		// 두 인스턴스의 좌석등급이 같다
		String p1Seat = p1.getSeat();
		String p2Seat = p2.getSeat();
		boolean seatSame = p1Seat.equals(p2Seat);
		
		// 이름과 연락쳐와 좌석등급이 같다면 true
		if(nameSame && telSame && seatSame ) {
			System.out.println("p1과 p2가 같습니다");
		} else {
			System.out.println("p1과 p2가 다릅니다");	// 그렇지않다면 false
		}
	
		boolean same = p1 == p2;	// 메모리가 같습니까?
		if(same) {
			System.out.println("p1과 p2과 같습니다");
		} else {
			System.out.println("p1과 p2가 다릅니다.");
		}
				
	}
}
