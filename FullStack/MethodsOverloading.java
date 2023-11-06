package FullStack;

public class MethodsOverloading {
	
	static int myMethod(int x,int y) {
		return x+y;
	}
	
	static double myMethod(double a,double b,double c) {
		return a*b*c;
	}
	
	static long myMethod (long i,long j) {
		return i-j;
	}
	
	public static void main(String args[]) {
		int var = myMethod(5,4);
		double var1 = myMethod(2,2,2);
		long var2 = myMethod(12L,5L);
		
		System.out.println(var);
		System.out.println(var1);
		System.out.println(var2);
	}

}
