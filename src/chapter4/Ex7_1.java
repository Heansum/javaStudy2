package chapter4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex7_1 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		Set<String> lyricsSet = new HashSet<>();
		
		while(true) {
			System.out.println("�뷡 ���縦 �Է��ϼ���. (����: -1) : ");
			
			String lyrics = scanf.next();
			if(lyrics.equals("-1")) {
				break;
			}
			
			if(lyricsSet.add(lyrics)) {
				
			} else {
				System.out.println("�̹� �Էµ� �����Դϴ� => " + lyrics);
			}
			System.out.println();
		
		
		} // end while
		
		
//		System.out.println("�뷡 ���縦 �Է��ϼ���");
//		String song = scanf.next();
//		
//		Input put1 = new Input(song);
//		System.out.println(put1);
//		
//		Set<String> hashSet = new HashSet<>();
//		hashSet.add(song);
//		System.out.println(hashSet);
//		
//		System.out.println("�뷡 ���縦 �Է��ϼ���");
//		String song1 = scanf.next();
//		Input put2 = new Input(song1);
//		System.out.println(put2);
//		hashSet.add(song1);
//		System.out.println(hashSet);
	}
}
