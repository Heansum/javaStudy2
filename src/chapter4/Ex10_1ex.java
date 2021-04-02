package chapter4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex10_1ex {
	public static void main(String[] args) {
		Map<String, Customer> customerMap = new HashMap<>();
		
		Customer c1 = new Customer("010-1473-3698", "결제방법 : 현금");
		Customer c2 = new Customer("010-1598-7894", "결제방법 : 카드");
		Customer c3 = new Customer("010-4569-1236", "결제방법 : 카드");
		Customer c4 = new Customer("010-2586-2584", "결제방법 : 현금");
		Customer c5 = new Customer("010-7418-5296", "결제방법 : 현금");
		
		customerMap.put("홍길동",c1);		// in Map (String, Customer)
		customerMap.put("김철수",c2);
		customerMap.put("황영희",c3);
		customerMap.put("유노윤호",c4);
		customerMap.put("고영희",c5);
		
		System.out.println(customerMap);
		
		// set은 get 메서드가 존재하지 않음
//		customerMap.get(c1);
//		customerMap.get(c2);
//		customerMap.get(c3);
//		customerMap.get(c4);
//		customerMap.get(c5);
		
		Set<String> keySet = customerMap.keySet();	// new keySet
		for(String key : keySet) {
			Customer c = customerMap.get(key);
			System.out.println(c.getTel());
			System.out.println(c.getPaymentMethod());
		}
		
		customerMap.clear();
		
		
		
	}
}
