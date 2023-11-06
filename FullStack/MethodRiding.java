package FullStack;

class Parent{
	void say(){
		System.out.println("Hello nirmal ");
	}
}
class nirmal extends Parent {
	void say() {
		super.say();
		System.out.println("Hello pa");
	}
}

public class MethodRiding {
	public static void main(String args[]) {
		
		nirmal myObj = new nirmal();
		
		myObj.say();
	}

}
