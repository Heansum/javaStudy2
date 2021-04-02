package chapter5;

public class Ex2 {
	public static void main(String[] args) {
		String birth = "jan";
		
		// �Ű������� ����� �̸��� �����ؼ�
		// �Ű������� ���޹��� �̸��� ���� �ִ� ����� ã�� �� ����
		try {
			BirthMonth birthMonth = BirthMonth.valueOf(birth);
			System.out.println(birthMonth);
			System.out.println(birthMonth.getKorMonth());
		} catch(IllegalArgumentException e) {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
			
		BirthMonth[] birthMonthArr = BirthMonth.values();
		for(BirthMonth birthMonth : birthMonthArr) {
			System.out.println(birthMonth + " = " + birthMonth.getKorMonth());
		}
		
		
		
	}
}
