package chapter4;

import java.util.HashMap;
import java.util.Map;

public class Ex10_1ex {
	public static void main(String[] args) {
		Map<String, Customer> customerMap = new HashMap<>();
		Customer c1 = new Customer("010-1473-3698", "결제방법 : 현금");
		Customer c2 = new Customer("010-1598-7894", "결제방법 : 카드");
		Customer c3 = new Customer("010-4569-1236", "결제방법 : 카드");
		Customer c4 = new Customer("010-2586-2584", "결제방법 : 현금");
		Customer c5 = new Customer("010-7418-5296", "결제방법 : 현금");
		
		customerMap.put("홍길동",c1);
		customerMap.put("김철수",c2);
		customerMap.put("황영희",c3);
		customerMap.put("유노윤호",c4);
		customerMap.put("고영희",c5);
		
		System.out.println(customerMap);
		
		
		
		
	}
}
