package Multithreading;

public class Mythread extends Thread {
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("Value Printing from Thread 1= "+ i);
		}
	}
}

