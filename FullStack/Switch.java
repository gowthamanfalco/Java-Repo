package FullStack;

import java.util.Scanner;

public class Switch {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a month");
		String month = myObj.nextLine();
		
		switch(month) {
		case "january":
		System.out.println("Pongal");
		break;
		case "february":
			System.out.println("Valentines day");
			break;
		case "march":
			System.out.println("simply waste ");
			break;
		case "april":
			System.out.println("april fool ");
			break;
		case "may":
			System.out.println("workers day ");
			break;
		case "june":
			System.out.println("School opening");
			break;
		case "july":
			System.out.println("MSD birthday ");
			break;
		case "august":
			System.out.println("mariamman festival ");
			break;
		case "september":
			System.out.println("Lord Ganesh Chaturthi");
			break;
		case "october":
			System.out.println("Gandhi Jayanti");
			break;
		case "november":
			System.out.println("Diwali");
			break;
		case "december":
			System.out.println("Super star birthday");
			break;
			
			
		default :{
			System.out.println("Invalid data");
		}
		}
		
	}

}
