package FullStack;

import java.util.Scanner;

public class Fib {
	public static void main (String args []) {
		Scanner g = new Scanner (System.in);
		int n = g.nextInt();
		System.out.println("Enter the length of Fibonacci series : ");
		int x=0;
		int y=1;
		int z=0;
		for ( int i=0 ;i<=n;i++ ) {
			System.out.println(x);
			z=x+y;
			x=y;
			y=z;
		}
	}
}
