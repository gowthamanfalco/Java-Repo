package FullStack;

import java.util.Scanner;

public class OppSide {
	public static void main (String args[]) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a row you need : ");
		int num = myObj.nextInt();
		int i,j,k;
		for(i=1;i<=num;i++) {
			for(k=1;k<=i+1;k++) {
				System.out.print(" ");
			}
			for(j=num;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
