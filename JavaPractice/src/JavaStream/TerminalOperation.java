package JavaStream;

import java.util.*;
import java.util.stream.*;

public class TerminalOperation {
	public static void main(String[] args) {
        List<String> names = List.of("Dharam Sir", "Shubham", "Pranshur", "Shiavam", "Hafiz", "Shayan", "Lakshamn","Nitin Sethi");
        
        System.out.println(names);
        
        List<String> filterNames = names.stream().map(str->str.toUpperCase())
                            .filter(str->str.startsWith("S"))
                            .collect(Collectors.toList());
                            
        filterNames.forEach(items-> {
            System.out.println(items);
        });
        
        System.out.println();
                            
        for(String item :  filterNames) {
            System.out.println(item);
        }
        
        System.out.println();
        //as terminal 
        names.stream().filter(str->str.startsWith("S")).sorted().forEach(System.out::println);
        
        // count of list
        long totalCount = names.stream()
                            .filter(str->str.startsWith("S"))
                            .count();
        System.out.println( "Total Filter List " +totalCount);
        
        // Find First
        String findFirst = names.stream().findFirst().get();
        System.out.println("Find the First - " + findFirst);
        
        //any match
        boolean anyMatch = names.stream().anyMatch(str->str.startsWith("x"));
        System.out.println("Any Match in the List - " + anyMatch);
        
        //All Matches
        
        boolean checkAllMatches = names.stream()
                                .filter(str->str.startsWith("S"))
                                .allMatch(str->str.startsWith("S"));
        System.out.println( "All matches in the list - " + checkAllMatches);
        
        // Reduce method
    }

}
