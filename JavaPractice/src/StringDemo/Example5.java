package StringDemo;

public class Example5 {
	public static void main(String[] args) throws InterruptedException {
		StringBuffer str = new StringBuffer();
		
		Thread t1 = new Thread(()->{
			for(int i = 0; i < 1000; i++) {
				str.append('b');
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i = 0; i < 1000; i++) {
				str.append('b');
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final String Lenght : "+ str.length());
	}
}
