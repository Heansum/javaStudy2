package chapter4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex10 {
	public static void main(String[] args) {
		Map<String, Integer> classOneKor = new HashMap<>();
		
		classOneKor.put("ȫ�浿", 95);
		classOneKor.put("��ö��", 18);
		classOneKor.put("����", 86);
		classOneKor.put("������ȣ", 36);
		classOneKor.put("Ȳ����", 69);
		
		System.out.println("�ʱ� ���� : " + classOneKor);
		// put �޼��带 ����� �� �̹� �����ϴ� Ű�� �����͸� �����ϸ�
		// �ش� Ű�� ����ִ� �����Ͱ� ���������.
		classOneKor.put("ȫ�浿", 73);
		
		System.out.println("key = ȫ�浿, value = 73 �߰� : " + classOneKor);
		
		classOneKor.remove("ȫ�浿");
		
		System.out.println("key = ȫ�浿 ���� : " + classOneKor);
		
		System.out.println("key = Ȳ����, value = " + classOneKor.get("Ȳ����"));
		
		Map<String, String> hashMap = new HashMap<>();
		
		hashMap.put("ȫ�浿", "���ڳ��");
		hashMap.put("��ö��", "�۽�Ʈ");
		hashMap.put("����", "����Ͻ�");
		hashMap.put("������ȣ","�۽�Ʈ");
		hashMap.put("Ȳ����", "���ڳ��");
		
		System.out.println("========== [ �°����� �¼� ���� ] ==========");
		System.out.println(hashMap);
		System.out.println("========= ========= ========= =========");
		
		hashMap.put("������ȣ","���ڳ��");
		System.out.println(hashMap);
		
		hashMap.remove("Ȳ����");
		System.out.println(hashMap);
		
		System.out.println(hashMap.get("ȫ�浿"));
		System.out.println(hashMap.get("��ö��"));
		System.out.println(hashMap.get("����"));
		System.out.println(hashMap.get("������ȣ"));
		
		Set<String> keySet = hashMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			
			System.out.println(key + " = " + hashMap.get(key));
			
			
			
		}
	
	}
}
