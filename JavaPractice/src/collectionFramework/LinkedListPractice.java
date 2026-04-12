package collectionFramework;

import java.util.*;

public class LinkedListPractice {
	public static void main(String[] args) {
		// Create a LinkedList Object.
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		// Add the element of Linked List
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		
		System.out.println(linkedList);
		linkedList.addFirst(0);
		linkedList.addLast(5);
		System.out.println("Print after addFirst and addLast - "+linkedList);
		linkedList.removeIf( x -> x%2 == 0);  // Removed Even Integer.
		System.out.println("Print after Removed Even No - "+linkedList);

	}

}
