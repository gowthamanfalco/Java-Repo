package FullStack;

interface baseA{
	void display();
	
}
interface baseB{
	void display2();
}

public class Interfacess implements baseA,baseB{
	
	@Override
	public void display2() {
		System.out.println(" all");
		
	}

	@Override
	public void display() {
		System.out.println(" hii");
		
	}
	public static void main(String args[]) {
		
		Interfacess ic = new Interfacess();
		
		ic.display();
		ic.display2();
		
		
	}

}
