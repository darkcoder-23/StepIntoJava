package Multithreading;

class Counter {
	int count  = 0;
	synchronized void increament() {
		count++;
	}
}

public class SynconizedExample {
	public static void main(String[] args) {
		Counter ctr = new Counter();
		
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < 1000; i++) {
				ctr.increament();
			}
			
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 1000; i++) {
				ctr.increament();
			}
			
		});
		
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total count of the increament : " + ctr.count);
		
	}

}
