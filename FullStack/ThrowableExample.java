package FullStack;

class CustomException extends Exception {
	
	public CustomException(String message) {
	super(message);
	}
}

public class ThrowableExample {
	
	public static void main(String args[]) {
		try {
			int age=-5;
			if(age<0) {
				throw new CustomException("Age cannot be negative");
			}
			System.out.println(age);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}

}
