package FullStack;

import java.util.Scanner;

public class BasicMath {
	public static void main(String args[]) {
		Scanner arth = new Scanner (System.in);
		System.out.println("Enter the num_1 :");
		int num_1 = arth.nextInt();
		System.out.println("Enter the num_2 :");
		int num_2 = arth.nextInt();
		System.out.println("Addition is " + (num_1+num_2));
		System.out.println("Subraction is " + (num_1-num_2));
		System.out.println("Multiplication is " +( num_1*num_2));
		System.out.println("Dividion is " + ( num_1/num_2));
		
	}

}
