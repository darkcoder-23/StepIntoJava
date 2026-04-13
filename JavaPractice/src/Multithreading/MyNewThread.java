package Multithreading;

public class MyNewThread implements Runnable {
	
	public void run() {
		for(int i = 1000; i > 0; i--) {
			System.out.println("Value Printing from Thread 2= " + i);
		}
	}

}
