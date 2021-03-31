package chapter3;

// E - Element
// K - Key
// V - Value
// T - Type
// N - Number

public class Person <T1, T2> {

	// �� ����
	private int eye = 2;
	// �� ����
	private int nose = 1;
	// �� ����
	private int mouth = 1;
	// �ĺ���
	private T1 id;
	
	private T2 tel;
	
	public Person(T tel) {
		this.tel = tel;
	}

	public void setTel(T tel) {
		this.tel = tel;
	}
	
	public void setID(T id) {
		this.id = id;
	}
	
	public T getID() {
		return id;
	}
	
	

	
}
