package FullStack;

import java.util.Scanner;

public class CurrentBill {
	public static void main(String args[]) {
		Scanner myObj = new Scanner (System.in);
		System.out.println("Enter your unit : ");
		int unit = myObj.nextInt();
		System.out.println("Enter unit price : ");
		int price =myObj.nextInt();
		
		if(unit<=300) {
			System.out.println("No need to pay bill - RS " + (unit * price));
		}
		else  {
			System.out.println("Your bill is - " + (unit * price));
			
		}
	}

}
