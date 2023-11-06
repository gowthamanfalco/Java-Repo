package FullStack;

import java.util.Scanner;

public class UserInput {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = myObj.next();
		System.out.println("Enter your age");
		int age = myObj.nextInt();
		System.out.println("Enter your address");
		String address =myObj.nextLine();
		String address1 =myObj.nextLine();
		String address2 =myObj.nextLine();
		
	}

}
