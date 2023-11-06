package FullStack;

class SoftwareUpdate extends Thread {
public	void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("updating your software............");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Restart extends Thread{
public	void  run() {
		for (int i=0;i<=5;i++) {
			System.out.println("Welcome");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Final extends Thread{
public	void run() {
		for(int i =0;i<=5;i++) {
			System.out.println("COMPLETED");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadingg {
	
	public static void main(String args[]) {
		
		SoftwareUpdate soft = new SoftwareUpdate();
		
		Restart re =new Restart();
		
		Final fn = new Final();
		
		soft.start();
		re.start();
		fn.start();
	}

}
