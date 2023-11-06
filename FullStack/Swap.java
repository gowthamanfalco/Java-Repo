package FullStack;

import java.util.Scanner;

public class Swap {
	public static void main(String args[]) {
		Scanner myObj = new Scanner (System.in);
		System.out.println("Enter a number :");
		int num_1 = myObj.nextInt();
		System.out.println("Enter a number :");
		int num_2 = myObj.nextInt();
		System.out.println("num_1= "+ num_1 + "  num_2 ="+num_2);
		num_1=num_1+num_2;
		num_2=num_1-num_2;
		num_1=num_1-num_2;
		System.out.println("num_1= "+ num_1 + "  num_2 ="+num_2);
		
		
		
		
		
	}

}
