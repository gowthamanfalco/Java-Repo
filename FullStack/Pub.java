package FullStack;

import java.util.Scanner;

public class Pub {
	public static void main (String args[]) {
		Scanner myObj = new Scanner (System.in);
		System.out.println("Enter you are age :");
		int age = myObj.nextInt();
		if(age>=18) {
			
			System.out.println("Enter membership card :");
			String card = myObj.next();
			
			
			if(card.equals("yes")) {
				System.out.println("Eligible and 10% discount");
			}
			else if(card.equals("no")){
				System.out.println("Eligible and 5% discount");
			}
			else {
				System.out.println("Invalid");
			}
		}
		else {
			System.out.println(" Not Eligible for  discount");
		}
	}

}
