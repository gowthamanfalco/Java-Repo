package FullStack;

import java.util.Scanner;

public class IfElseSta {
	public static void main (String args[]) {
		Scanner myObj = new Scanner (System.in);
		
		System.out.println("Enter your age :");
		int age = myObj.nextInt();
		
		if(age>=18) {
			System.out.println("You are eligible for voting");
		}
		else {
			System.out.println("You are not eligible for voting ");
		}
	}

}
