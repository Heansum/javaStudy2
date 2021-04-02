package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex12 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		// set�� get �޼��尡 �������� ����
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// foreach
		// �׻�� for��
		for (Integer i : set) {
			System.out.println(i);
		}
		
		Set<String> keySet = hashMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			
			System.out.println(key + " = " + hashMap.get(key));
			
			
			
		}
		
	}
}
