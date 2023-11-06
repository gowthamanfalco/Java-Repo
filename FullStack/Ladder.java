package FullStack;

import java.util.Scanner;

public class Ladder {
	public static void main (String args []) {
		Scanner myObj = new Scanner (System.in);
		System.out.println("Enter your mark : ");
		int mark = myObj.nextInt();
		
		if(mark>=90 && mark<=100) {
			System.out.println("Grade A");
		}
		else if (mark>=80 && mark<=89) {
			System.out.println("Grade B");
		}
		else if (mark>=70 && mark<=79) {
			System.out.println("Grade C");
		}
		else if (mark>=60 && mark<=69) {
			System.out.println("Grade D");
		}
		else if (mark>=50 && mark<=59) {
			System.out.println("Grade E");
		}
		else if (mark>=40 && mark<=49) {
			System.out.println("Grade F");
		}
		else if (mark>=30 && mark<=39) {
			System.out.println("Grade G");
		}
		else if (mark>=20 && mark<=29) {
			System.out.println("Grade H");
		}
		else if (mark>=10 && mark<=19) {
			System.out.println("Grade I");
		}
		else {
			System.out.println("Fail");
		}
	}

}
