package chapter4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex10_1ex {
	public static void main(String[] args) {
		Map<String, Customer> customerMap = new HashMap<>();
		
		Customer c1 = new Customer("010-1473-3698", "������� : ����");
		Customer c2 = new Customer("010-1598-7894", "������� : ī��");
		Customer c3 = new Customer("010-4569-1236", "������� : ī��");
		Customer c4 = new Customer("010-2586-2584", "������� : ����");
		Customer c5 = new Customer("010-7418-5296", "������� : ����");
		
		customerMap.put("ȫ�浿",c1);		// in Map (String, Customer)
		customerMap.put("��ö��",c2);
		customerMap.put("Ȳ����",c3);
		customerMap.put("������ȣ",c4);
		customerMap.put("����",c5);
		
		System.out.println(customerMap);
		
		// set�� get �޼��尡 �������� ����
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
