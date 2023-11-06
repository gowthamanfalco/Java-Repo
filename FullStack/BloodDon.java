package FullStack;

import java.util.Scanner;

public class BloodDon {
	public static void main(String args[]) {
		Scanner myObj = new Scanner (System.in);
		System.out.println("Enter the age : ");
		int age = myObj.nextInt();
		System.out.println("Enter the weight");
		int weight = myObj.nextInt();
		if(age>=18) {
			if(weight>=45) {
				System.out.println("You are eligible for blood donate");
			}
			else {
				System.out.println("You are under weight");
			}
		}
		else {
			System.out.println("You are under age catagory");
			}
	}

}
