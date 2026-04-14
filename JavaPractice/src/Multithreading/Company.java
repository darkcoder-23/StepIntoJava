package Multithreading;

public class Company {
	int n;
	boolean flag = false;
	// If flag = false it means produce the items.
	// if flag = true  it means consume the items.
	synchronized public void produced_item(int n) {
		
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		this.n=n;
		System.out.println("Produced Product : " + this.n);
		flag = true;
		notify();
	}
	synchronized public int consume_item(int n) {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		System.out.println("Consumed Product : " + this.n);
		flag = false;
		notify();
		return this.n;
	}
	public static void main(String[] args) {
		
		Company comp = new Company();
		Producer p1 = new Producer(comp);
		Consumer c1 = new Consumer(comp);
		p1.start();
		c1.start();
	}

}
