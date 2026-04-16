package Multithreading;

public class Producer extends Thread {
	
	Company c;
	
	public Producer(Company c) {
		this.c = c;
	}
	
	
	public void run() {
		
		int i = 1;
		while(true) {
			this.c.produced_item(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
			i++;
		}
		
		
	}

}
