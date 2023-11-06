package FullStack;

import java.util.Scanner;

public class Pattern {
		public static void main (String args[]) {
			Scanner myObj = new Scanner(System.in);
			System.out.println("Enter a row you need : ");
			int num = myObj.nextInt();
			int i,j;
			for(i=0;i<=num;i++) {
				for(j=0;j<=num-i;j++) {
					System.out.print("*");
				}
			System.out.println();
		}
		
		}
		
}

