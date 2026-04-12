package JavaStream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class CoutingOccuranceOfStringByLength {
	
	public static void main(String[] args) {
		List<String> names  = List.of("One", "Three", "Four", "Shayan", "Raza", "Avinsh", "Avinsh");
	    
	    List<Integer> lengths = names.stream().map(str->str.length()).collect(Collectors.toList());
	    
	    System.out.println(lengths);
	    // count the occurance of the each lenth of the string.
	    Map<Integer,Long> mapCouting = names.stream().map(str->str.length()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	    System.out.println(mapCouting);
	    
	    Map<Integer,Long> mapValue = names.stream().collect(Collectors.groupingBy(String :: length, Collectors.counting()));
	    System.out.println(mapValue);
	    
	    // 
	}

}
