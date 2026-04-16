package Multithreading;

class Test extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Demaon Thread");
		} else {
			System.out.println("User Thread");
		}
		
	}
	
	
}

public class DemonThreadExamples {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		t1.setDaemon(true);
		
		t1.start();		
		t2.start();
		t3.start();
		
	}

}
