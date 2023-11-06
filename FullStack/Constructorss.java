package FullStack;

public class Constructorss {
	
	String Name;
	int age;
	// Default 
	public Constructorss() {
		Name = "gowthaman";
		age = 22;
	}
	//Parameterized
	public Constructorss( String a,int b) {
		Name = a;
		age = b;
	}
	//Copy 
	
	public Constructorss (Constructorss  ac) {
		Name = ac.Name;
		age = ac.age;
	}
	
	public static void main(String args[]) {
		
		//Default
		
		Constructorss ab = new Constructorss();
		
		System.out.println(ab.Name);
		System.out.println(ab.age);
		
		//Parameterized
		
		Constructorss ab1 = new Constructorss("Nirmal" , 22);
		
		System.out.println(ab1.Name);
		System.out.println(ab1.age);
		
		
		//Copy 
		
		Constructorss ab2 = new Constructorss(ab);
		
		System.out.println("Copy constructor :");
		System.out.println(ab2.Name);
		System.out.println(ab2.age);
	}

}
