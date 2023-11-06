package FullStack;

public class BoxVolume {
	
	static int myMethod(int l, int b,int h) {
		return l*b*h;
	}
	
	public static void main (String args[]) {
		int var = myMethod(4,5,6);
		System.out.println(var);
	}

}
