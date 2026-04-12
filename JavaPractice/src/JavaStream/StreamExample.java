package JavaStream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class StreamExample {
	
	public static void main(String[] args) {
		
		
		
		
		// Find the Length of each string in the List
		System.out.println("Find the Length of each string in the List");
		List<String> numbersString = List.of("Hello", "two", "Hello","fours" ,"Five");
		System.out.println(numbersString);
		List<Integer> stringLength = numbersString.stream()
									.map(str->str.length())
									.collect(Collectors.toList());
		System.out.println(stringLength);
		
		
		
		
		
		
		// Find the square of each number in the list of Integer
		List<Integer> numbersList = List.of(9,5,8,2,9,3,8,0,6,100);
		System.out.println("Find the square of each number in the list of Integer");
		System.out.println( numbersList);
		List<Integer> squareNumber = numbersList.stream()
									 .map(num->num*num)
									 .collect(Collectors.toList());
		System.out.println(squareNumber);
		
		
		
		
		
		
		//Find Count the each occurrence of string , list
		List<Integer> numbers = List.of(1,4,3,5,2,5,1,3,4,5,6,6,6,7,7,8,3,2);
		Map<Integer,Long> countOccurrence = numbers.stream()
								.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(countOccurrence);
		
		Map<Integer,Long> mp = numbers.stream()
									.filter(x->x%2==0)
									.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(mp);
		
		
		
		
		// Occurrence in the string.
		String str = "Md Shayan Raza";
		Map<Character,Long> charOccurence = str.chars()
											.mapToObj(c->(char) c)
				                            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(charOccurence);
		
		String withoutSpace  = Arrays.stream(str.split(" ")).collect(Collectors.joining());
		System.out.println(withoutSpace);
		
		
		
		
		
		// Grouping odd even number from the list of integer
		System.out.println(numbers.stream().collect(Collectors.groupingBy(x->x%2==0)).get(true));
		System.out.println(numbers.stream().collect(Collectors.groupingBy(x->x%2!=0)).get(true));
		
		
		
		
		// Find fist and second max element of given list of integer.
		List<Integer> num = List.of(1,2,4,5,6,5);
		System.out.println(num);
		int firstmax = num.stream()
				       .sorted((x,y)->y-x)
					   .min((x,y)->y-x).get();
		System.out.println("First Max - " + firstmax);
		
		int secondmax = num.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second Max - " + secondmax);
		
		
		
		
		// write a code a sort a list and append "Visited" at the end.
		
		List<String> cityNames = List.of("Banglore", "New Delhi", "Noida", "Chennai", "Hyderabad");
		
		List<String> vistedCites = cityNames.stream()
				                   .map(city->city.concat(" - Visited"))
				                   .collect(Collectors.toList());
		vistedCites.forEach(city->System.out.println(city));
		
		
		
		
		
		
		// write a code a sort a list and append "Visited" at the first.
		
		List<String> visCity = cityNames.stream()
				               .map(city-> "Visited - " + city)
				               .toList();
		System.out.println("Apped in the Front of every City");
		for(String vis : visCity) {
			System.out.println(vis);
		}
		
		
		
		
		// Find the all Element grater than the given value from the List
		int target = 5;
		List<Integer> numberList = List.of(1,3,5,1,2,5,6,7,2,5,7,3,6,8,9,0,4,3,3,23,4,5,3);
		
		List<Integer> numberGreaterThanTarget = numberList.stream()
                                                .filter(x->x>=target).sorted().distinct()
                                                .toList();
		System.out.println(numberGreaterThanTarget);
		
		
	}

}
