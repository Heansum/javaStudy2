package chapter5;

public class Ex4 {
	public static void main(String[] args) {
		int genderValue = 2;
		
		Gender gender = Gender.getGender(genderValue);
		switch(gender) {
			case MALE:
				System.out.println("������ ���� ���� ����");
				break;
			
			case FEMALE:
				System.out.println("������ ���� ���� ����");
				break;
		}
	
	
	}
}
