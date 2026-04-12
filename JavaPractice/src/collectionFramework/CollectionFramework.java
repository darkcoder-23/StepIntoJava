package collectionFramework;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionFramework {
	
	public static void main(String[] args) {
		System.out.println("Hello Collection Framewrork");
		List<Integer> employeeCode = new ArrayList<>();
		employeeCode.add(212);
		employeeCode.add(123);
		employeeCode.add(321);
		employeeCode.add(223);
		employeeCode.add(443);
		
		Iterator<Integer> itr = employeeCode.iterator();
		System.out.println("The Numbver is Printing Using Iterator");
		while(itr.hasNext()) {
			Integer currentItr = itr.next();
			System.out.println(currentItr);
			if(currentItr == 123) {
				itr.remove();
			}
		}
		System.out.println("The After removingis Printing Using Iterator");
		Iterator<Integer> itr2 = employeeCode.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
			
		}
		System.out.println("The After removingis Printing Using for loop");
		for( int it : employeeCode) {
			System.out.println(it);
			
		}
	}
}
