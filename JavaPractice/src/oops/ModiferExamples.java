package oops;

import Modifiers.NeWClass2;

class CheckProtectedMember extends NeWClass2 {
	String newName = name1;
	int newId = id;
	public void displayNew() {
		
		System.out.println("Check the display new of subcalss name " + newName);
		System.out.println("Check the display new of subcalss name " + newId);
	}
}

public class ModiferExamples {
	public static void main(String[] args) {
		CheckProtectedMember obj = new CheckProtectedMember();
		obj.newName = "shayan";
		obj.newId = 7876;
		obj.displayNew();
		
	}

}
