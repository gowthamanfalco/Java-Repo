package FullStack;

import java.util.Scanner;

public class Sun {
	public static void main(String args[]) {
		Scanner myObj = new Scanner (System.in);
		System.out.println("Enter the time :");
		int time = myObj.nextInt();
		if(time>=6 && time<=11) {
			System.out.println("Morning  "+(time)+" The sun temparature is 20 degree");
		}
		else if (time>=11 && time<=16) {
			System.out.println("Afternoon  "+(time)+" The sun temparature is 32 degree");
		}
		else if (time>=16 && time<=18) {
			System.out.println("Evening  "+(time)+" The sun temparature is 25 degree");
		}
		else {
			System.out.println("Moon will apper");
		}
	}
}
