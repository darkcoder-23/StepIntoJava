package interview;

class NumberPrinter {
	private int number = 1;
	private int limit;
	
	public NumberPrinter(int limit) {
		this.limit = limit;
	}
	
	public synchronized void printOdd() {
		while(number <= limit) {
			while(number%2 == 0) {
				try {
					wait();
				}catch (Exception e) {}
			}
			if(number <= limit ) {
				System.out.print(number + " ");
				number++;
				notify();
			}
		}
	}
	public synchronized void printEven() {
		while(number <= limit) {
			while(number%2 != 0) {
				try {
					wait();
				}catch (Exception e) {}
			}
			if(number <= limit ) {
				System.out.print(number + " ");
				number++;
				notify();
			}
		}
	}
}


public class ThreadExamplesDemo {
	public static void main(String[] args) {
		NumberPrinter obj = new NumberPrinter(10);
		Thread t1 = new Thread( () -> obj.printOdd() );
		Thread t2 = new Thread( () -> obj.printEven() );
		t1.start();
		t2.start();
	}

}
