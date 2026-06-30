package StringDemo;

public class Example4 {
	public static void main(String[] args) throws InterruptedException {
		StringBuilder str = new StringBuilder();
		
		Thread t1 = new Thread(()->{
			for(int i = 0; i<1000; i++) {
				str.append('a');
				
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i = 0; i<1000; i++) {
				str.append('a');
				
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println("Length of the Updated String : " + str.length());
		
	}
}
