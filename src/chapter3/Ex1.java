package chapter3;

public class Ex1 {
	public static void main(String[] args) {
//		ClassName<Object> object1 = new ClassName<Object>();
//		ClassName<String> object2 = new ClassName<String>();
//		
//		ClassName<Integer> object3 = new ClassName<Integer>();
//		ClassName<Double> object4 = new ClassName<Double>();
//		
//		Person<Integer> manId = new Person<Integer>();
//		
//		Person<String> manName = new Person<String>();
//		Person<String> manName2 = new Person<>();
//		
//		// 제너릭 타입 자리에는 기본 데이터타입은 들어갈 수 없음
//		// 제너릭 타입 자리에는 클래스만 올 수가 있다
//		// 기본 데이터 타입을 클래스로 만들어두었다.
//		// 정수, 실수, 문자를 제너릭 타입 자리에 쓰려면 
//		// 기본 데이터 타입을 클래스로 만들어준 클래스를 사용해야한다.
//		Person<Integer> p3 = new Person<>();
//		
//		p3.setID(10);
//
//		Integer ID = p3.getID();
//		int intID = Integer.valueOf(0);
		
		Person<String, String> p2 = new Person<>("010-1234-5678");
		Person<Integer, Integer> p1 = new Person<>(1012345678);
		// 자바에서는 0으로 시작할 수 없음
		
		
		
		
	}
}
