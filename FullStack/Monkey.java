package FullStack;

import java.util.Scanner;

public class Monkey {
	public static void main (String args[]) {
		Scanner myObj = new Scanner (System.in);
		System.out.println("Enter you are time : ");
		int time = myObj.nextInt();
		
		if(time>=6 && time<=9 ) {
			System.out.println("Morning "+(time)+" O clock So Monkey can cross the river because crocodiles are sleeping");
		}
		else if (time>=9 && time<=14 ) {
			System.out.println("Afternoon "+(time)+" O clock So Monkey can't cross the river  because crocodile are not sleeping");
		}
		else if (time>=15 && time<=18) {
			System.out.println("Evening "+(time)+" O clock So Monkey can cross the river because crocodiles are sleeping");
		}
		else if (time>=18 && time<=24) {
			System.out.println("Night "+(time)+" O clock So Monkey can cross the river because crocodiles are sleeping");
		}
		else if (time>=1 && time<=6) {
			System.out.println("Early Morning "+(time)+" O clock So Monkey can cross the river because crocodiles are sleeping");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
