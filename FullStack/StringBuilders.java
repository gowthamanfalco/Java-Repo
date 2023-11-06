package FullStack;

public class StringBuilders {
	public static void main(String args[]) {
		StringBuilder myObj = new StringBuilder("Gowthaman");
		StringBuilder myObj1 = new StringBuilder("Nirmal");
		System.out.println(myObj.length());
		System.out.println(myObj.isEmpty());
//		System.out.println(myObj.reverse());
		System.out.println(myObj.indexOf("o"));
		System.out.println(myObj.insert(5, "hi"));
		System.out.println(myObj.compareTo(myObj1));
		System.out.println(myObj.equals(myObj1));
		System.out.println(myObj.codePointAt(1));
		
	}

}
