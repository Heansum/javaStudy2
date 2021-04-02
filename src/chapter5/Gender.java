package chapter5;

public enum Gender {
//	MALE("1"), FEMALE("2");
//	
//	private final int genderNum;
//	public String getgender(int value) {
//		this.genderNum = value;
//	}
//	
//	public static Gender getGender(int value) {
//		Gender[] genderArr = Gender.values();
//		
//		Gender result = null;
//		
//		for(Gender : GenderArr) {
//			int genderNum = gender.getGender();
//			
//			if
//		}
//		
//		return result = Gender;
//	}
	
	MALE(), FEMALE();
	
	public static Gender getGender(int value) throws IllegalArgumentException{
		if(value == 1) {
			return Gender.MALE;
		} else if(value == 2) {
			return Gender.FEMALE;
		} else {
			throw now IllegalArgumentException;
		}
		
		
	}
	
	
	
	
}
