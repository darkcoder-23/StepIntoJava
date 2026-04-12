package JavaStream;

import java.util.*;
import java.util.stream.*;

public class TerminalMethod {
	
	public static void main(String[] args) {
		List<Integer> number = List.of(1,2,3,5,7,3,6,8,9,3,10,11,14,15,63,16,75,8);
		System.out.println(number);
		List<Integer> evenNumber = number.stream()
								   .filter(x->x%2==0)
								   .distinct()
								   .collect(Collectors.toList());
		
		System.out.println("Even Number - "+ evenNumber);
		
		// Print using forEach() method
		evenNumber.forEach(x->System.out.println(x));

		List<String> names = List.of("Alice", "Charlie", "Dvaid", "Bob", "Ahmed", "Arman","Ali");
		
		names.stream().filter(str->str.startsWith("A")).forEach(y->System.out.println(y));
		
		// to array terminal method.
		String[] namesArray = names.stream().filter(str->str.startsWith("A")).toArray(String[]:: new);
		System.out.println("Printin items from array");
		
		for( String item : namesArray ) {
			System.out.println(item);
		}
		
		// Use the reduce() terminal Methods
		List<Integer> numbers = List.of(3,9,1,2,5,2,5,6,3,6,1,7,2,6,7);
		int sum  = numbers.stream()
				   .distinct()
				   .reduce((x,y)->x+y).get();
		int oddSum = numbers.stream()
				     .filter(x->x%2!=0)
				     .distinct()
				     .reduce((x,y)->x+y).get();
		int evenSum = numbers.stream()
					  .distinct()
					  .filter(x->x%2==0)
					  .reduce((x,y)-> x+y).get();
		
		List<Integer> list = numbers.stream()
				   .filter(x->x%2!=0)
				   .distinct()
				   .collect(Collectors.toList());

		System.out.println("List Number - "+ list);
		System.out.println("Total Distinct Sum " + sum);
		System.out.println("Total Distinct Odd Sum " + oddSum);
		System.out.println("Total Distinct Even Sum " + evenSum);
		
		// count , findFirst, First Any
		long count = numbers.stream()
			            .count();
		System.out.println("Total item in the List - " + count);
		
		// find first
		int findFirst = numbers.stream().findFirst().get();
		System.out.println(findFirst);
		
		// Find Random Number in the given list
		int random = numbers.stream().findAny().get();
		System.out.println("Find Any - "+ random);
		
		// find the minimum number in the list.
		int mini = numbers.stream().min((x,y)->x-y).get(); 
		System.out.println("Minimum Number in the List " + mini);
		
	    // Minimum using comparator
		
		int maxiNumber = numbers.stream().min(Comparator.reverseOrder()).get();
		System.out.println("Maximun Number from the List - " + maxiNumber);
		
		
		int miniNumber = numbers.stream().max(Comparator.reverseOrder()).get();
		System.out.println("Minimun Number form the List - " + miniNumber);
		
		
		
		
		
		
		
		
		
		
		
	}

}
