package Modifiers;

class A {
	protected String name;
	protected int id;
	
	protected void show() {
		System.out.println("Name is "+ name + " & Id is " + id);
	}
}

class B extends A{
	
	public void display() {
		System.out.println("This is display of the "+ this.name + " & " + this.id);
	}
}

public class ModifierDemo {
	public static void main(String[] args) {
		B obj = new B();
		obj.name = "Shayan";
		obj.id = 786;
		System.out.println("Display the Child Funciton");
		obj.display();
		System.out.println("Display the Parent Funciton");
		obj.show();
		
	}
	
	
}