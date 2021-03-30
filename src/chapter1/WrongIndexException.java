package chapter1;

public class WrongIndexException extends Exception {
	private static final long serialVersionUID = -2103221287283272330L;
	
	public WrongIndexException(String msg) {
		super(msg);
	}
}
