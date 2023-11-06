package FullStack;

public class ExceptionArrays {
	
	public static void main(String args[]) {
		
		try {
			int a[]= new int [5];
			a[6]=12;
			System.out.println(a);
		}
		catch( Exception e) {
			System.out.println(e);
			System.out.println("Exception handled");
		}
	}

}
