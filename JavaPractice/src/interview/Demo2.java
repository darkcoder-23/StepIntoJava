package interview;

class Demo3 extends Demo {
	@Override
	protected void printDemo() {
		System.out.println(" I am of the demo3 class");
	}
	
	
}

public class Demo2 {
	public static void main(String[] args) {
		Demo obj = new Demo3();
		obj.printDemo();
		
		
	}
}
