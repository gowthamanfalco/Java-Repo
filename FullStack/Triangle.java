package FullStack;

public class Triangle {
	public static void main(String args[]) {
		int i,j,k;
		for(i=0;i<=4-1;i++) {
			for(j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(k=1;k<=i+1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
