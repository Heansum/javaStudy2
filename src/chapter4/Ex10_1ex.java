package chapter4;

import java.util.HashMap;
import java.util.Map;

public class Ex10_1ex {
	public static void main(String[] args) {
		Map<String, Customer> customerMap = new HashMap<>();
		Customer c1 = new Customer("010-1473-3698", "������� : ����");
		Customer c2 = new Customer("010-1598-7894", "������� : ī��");
		Customer c3 = new Customer("010-4569-1236", "������� : ī��");
		Customer c4 = new Customer("010-2586-2584", "������� : ����");
		Customer c5 = new Customer("010-7418-5296", "������� : ����");
		
		customerMap.put("ȫ�浿",c1);
		customerMap.put("��ö��",c2);
		customerMap.put("Ȳ����",c3);
		customerMap.put("������ȣ",c4);
		customerMap.put("����",c5);
		
		System.out.println(customerMap);
		
		
		
		
	}
}
