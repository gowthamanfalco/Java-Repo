package FullStack;
class Number{
	void display() {
		try {
			String str="Two";
			int num=Integer.parseInt(str);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Error");
	}
}

public class NumberFormat {
	public static void main (String args[]) {
		Number num = new Number();
		num.display();
	}

}
