package FullStack;


class Property{
	int a = 5;
	
	void houseLands() {
		System.out.println("Distributing the property");
	}
}

class Boy extends Property{
	int  b = 3;
	
	void house() {
		System.out.println("House for the boy");
	}
}

class Girl extends Property{
	int g = 2;
	
	void land() {
		System.out.println("Land for girl");
	}
}

public class Hierarchical {
	public static void main(String args[]) {
		Girl myObj = new Girl();
		System.out.println(myObj.a);
		System.out.println(myObj.g);
		myObj.houseLands();
		myObj.land();
		
		Boy myObj2 = new Boy();
		System.out.println(myObj2.a);
		System.out.println(myObj2.b);
		myObj2.houseLands();
		myObj2.house();
		
		Property myObj3 = new Property();
		System.out.println(myObj3.a);
		myObj3.houseLands();
}

}
