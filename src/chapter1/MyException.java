package chapter1;

// ������ ���� Ŭ������ ����
// My Exception�� ArrayIndexOutofBoundsException ��� ������ ���ܰ� �ȴ�.
public class MyException extends RuntimeException {
	// ����ȭ
	private static final long serialVersionUID = -2103221287283272330L;

	// msg -> ���ܰ� �� �߻��ߴ���, ������
	public MyException(String msg){
		super(msg);
	}
}
