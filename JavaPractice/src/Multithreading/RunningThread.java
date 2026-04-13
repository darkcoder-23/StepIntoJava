package Multithreading;

public class RunningThread {
	
	public static void main(String[] args) {
		
		Mythread t1 = new Mythread();
		t1.start();
		
		// Another object
		MyNewThread thr = new MyNewThread();
		Thread t2 = new Thread(thr);
		t2.start();
		
		
		
	}

}
