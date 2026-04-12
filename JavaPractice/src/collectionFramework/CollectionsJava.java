package collectionFramework;
import java.util.*;

public class CollectionsJava {
	
	public static void main(String[] args) {
		System.out.println("Implemented Collecions Methods");
		List<Integer> values = new ArrayList<>();
		
		values.add(1);
		values.add(4);
		values.add(5);
		values.add(2);
		values.add(3);
		
		System.out.println("Maximum number from the List is " + Collections.max(values));
		System.out.println("Minimum number from the List is " + Collections.min(values));
		System.out.println("Sorted List");
		Collections.sort(values);
		for(Integer num : values) {
			System.out.print( num + " ");
		}
		
	}

}
