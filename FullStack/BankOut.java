package FullStack;

public class BankOut {
	
	public static void main(String args[]) {
		
		BankAcc myObj = new BankAcc();
		
		myObj.setpin(2564);
		
		System.out.println("NAME: "+myObj.name);
		System.out.println("BRANCE: "+myObj.BankName);
		System.out.println("ACCNO: "+myObj.AccountNumber);
		System.out.println("IFSCCODE: "+myObj.IfscCode);
		System.out.println("PHONE NUMBER: "+myObj.PhoneNumber);
		System.out.println("GENDER: "+myObj.gender);
		System.out.println("PIN NUMBER: "+myObj.getpin());
		
	}
	
	

}
