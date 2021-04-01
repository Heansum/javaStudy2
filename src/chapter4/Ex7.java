package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex7 {
	public static void main(String[] args) {
		// 저장하는 데이터의 순서를 보장하지는 않음
		Set<Integer> hashSet = new HashSet<>();
		
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(5);
		hashSet.add(7);
		System.out.println("초기 상태 : " + hashSet);
	
		hashSet.add(1);
		System.out.println("요소 1을 추가 : " + hashSet);
		
		boolean isAdd = hashSet.add(7);
		if(isAdd) {
			System.out.println("요소 7을 추가 : " + hashSet);
		}
		
		isAdd = hashSet.add(9);
		if(isAdd) {
			System.out.println("요소 9을 추가 : " + hashSet);
		}
		
		hashSet.remove(1);
		System.out.println("요소 1을 삭제 : " + hashSet);
		
		// 요소를 불러옴
		Iterator<Integer> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			Integer el = iterator.next();
			
			System.out.println(el);
		}
		
		
	}
}
