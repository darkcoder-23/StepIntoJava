package Multithreading;

public class ThreadOp {
	
	public static void main(String[] args) {
		System.out.println("Programme Started ....");
		
		int x= 35+23;
		System.out.println("The Value of the Sum is : "+x);
		
		// Thread
		Thread t = Thread.currentThread();
		String thrName = t.getName();
		System.out.println("Current Running thread is : " + thrName);
		t.setName("MyMainThread");
		System.out.println("Updated the thread name is : " + t.getName());
		
		
		UserThread newThread = new UserThread();
		newThread.start();
		System.out.println("Current Running thread is : " + newThread.getName());
		try {
			newThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Programm Ended ...");
		
		
		try {
			Thread.sleep(5000);
		}catch(Exception e) {};
				
		
		System.out.println("Print the Thread is : " + newThread.getId());
		
		
	}

}
