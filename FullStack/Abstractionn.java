package FullStack;

abstract class Atm{
	abstract void cash();
}
abstract class Withdral extends Atm {
	abstract void pinChange();

	
	void balanceCheck() {
		System.out.println("Balance RS: 500");
	}
}

public class Abstractionn extends Withdral{

	@Override
	void pinChange() {
		System.out.println("Enter a new Pin");
		
	}

	@Override
	void cash() {
		System.out.println("YOu Debited RS :200");
		
	}
	
	public static void main(String args[]) {
		Abstractionn abc = new Abstractionn();
		abc.pinChange();
		abc.cash();
		abc.balanceCheck();
	}

}
