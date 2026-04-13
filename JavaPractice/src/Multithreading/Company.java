package Multithreading;

public class Company {
	
	int n;
	public void produced_item(int n) {
		this.n = n;
		System.out.println("Produced : "+this.n);
	}
	
	synchronized public int consume_item(int n) {
		System.out.println("Consumed : "+this.n);
		return this.n;
	}
	
	synchronized public static void main(String[] args) {
		Company comp = new Company();
		Producer p = new Producer(comp);
		Consumer c = new Consumer(comp);
		
		p.start();
		c.start();
	}

}
