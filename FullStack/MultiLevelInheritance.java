package FullStack;

class Goa{
	
	int rs = 15000;
	
	void enjoyment() {
		System.out.println("vibing with friends");
	}
}

class Tanjore extends Goa{
	
	int ex = 1000;
	
	void worship() {
		System.out.println("Lord Shivan");
	}
}

class Losvegas extends Tanjore {
	
	int doll = 100000;
	
	void Visiting() {
		System.out.println("Exploring city and Enjoying with our friends");
	}
}





public class MultiLevelInheritance {
	
	
	public static void main (String args[]) {
		
		Losvegas myObj = new Losvegas();
		System.out.println(myObj.rs);
		System.out.println(myObj.ex);
		System.out.println(myObj.doll);
		myObj.enjoyment();
		myObj.worship();
		myObj.Visiting();
		
		Tanjore myObj2 = new Tanjore();
		System.out.println(myObj2.rs);
		System.out.println(myObj.ex);
		myObj2.enjoyment();
		myObj2.worship();
		
		Goa myObj3 = new Goa();
		System.out.println(myObj3.rs);
		myObj3.enjoyment();
		
	}

}
