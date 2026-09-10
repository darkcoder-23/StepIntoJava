package collectionFramework;

import java.util.*;

public class CommonMethodCollection {
	
	public static void main(String[] args) {
		System.out.println("Implementing the common Method of Collection Framework");
		
		List<Integer> arr =  new ArrayList<>();
		
		arr.add(5);
		arr.add(15);
		arr.add(9);
		arr.add(14);
		arr.add(1);
		arr.add(5);
		
		
		Iterator<Integer> it  = arr.iterator();
		// Print the Value of ArrayList Value.
		System.out.println("List of Values of Array List");
		while(it.hasNext()) {
			 System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("Size of List is => " + arr.size() );
		
		System.out.println("isEmpty => " + arr.isEmpty());
		System.out.println("Removed from list at index => " + arr.remove(1));
		
		System.out.println("Contain => " + arr.contains(15));
		
		arr.add(15);
		
		System.out.println("Contains => " + arr.contains(15));
		
		arr.remove(Integer.valueOf(15));
		
		System.out.println("Value is removed by Object => " + arr.contains(15));
		
		// Created the Stack Data Structure and  add operation.
		Stack<Integer> st = new Stack<>();
		
		st.add(11);
		st.add(23);
		st.add(17);
		
		// Add all stack value into the list.
		arr.addAll(st);
		System.out.println("Stack all Value contains in the list => "+arr.containsAll(st));
		
		arr.remove(Integer.valueOf(17));
		System.out.println("Stack all Value contains in the list => "+arr.containsAll(st));
		
		arr.removeAll(st);
		
		System.out.println("Stack All Value  is present in the list => " + arr.containsAll(st));
		
		arr.clear();
		
		System.out.println("List is empty => " + arr.isEmpty());
		


	}

}
