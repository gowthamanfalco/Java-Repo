package FullStack;

class Parentep{
	int x=10;
	
	void myMethodd() {
		System.out.println("Im the base class");
	}
}
class childs extends Parentep{
	
	int y=55;
	
	void myMethod2() {
		System.out.println("Im the derived class");
	}
}



public class SingleInheritancee {
	
	public static void main(String args[]) {
		
		childs myObj = new childs();
		System.out.println(myObj.x);
		System.out.println(myObj.y);
		myObj.myMethodd();
		myObj.myMethod2();
	}

}
