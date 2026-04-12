package JavaStream;
import java.util.*;
import java.util.stream.*;

public class IntermidiateExpample {
	public static void main(String[] args) {
        List<Integer> numbers  = List.of(2,3,4,4,6,7,8,6,9,11,9,2,11,5,25,15);
        System.out.println(numbers);
        
        // Return the list of odd number.
        List<Integer> oddNum = numbers.stream()
                               .filter(x->x%2!=0)
                               .collect(Collectors.toList());
                               
        System.out.println("Odd Number List - " + oddNum);
        
        // Multiple of 5
        List<Integer> multipleOfFive = numbers.stream()
                                       .filter(x->x%5==0)
                                       .collect(Collectors.toList());
        System.out.println("Multiple of Five - " + multipleOfFive);
        // Sort the list.
        List<Integer> sortedList = numbers.stream()
                                   .sorted()
                                   .collect(Collectors.toList());
        System.out.println("Soreted List - "+sortedList);
        // Distinct List
        List<Integer> distinctList = numbers.stream()
                                    .distinct()
                                    .collect(Collectors.toList());
                                    
        System.out.println("Distinct number List - " + distinctList);
        //Limit number of items from the list 
        List<Integer> limitList = numbers.stream()
                                  .distinct()
                                  .limit(5)
                                  .collect(Collectors.toList());
        System.out.println("Limit Five from the list - "+limitList);
        //Skip the from the list
        List<Integer> skipList = numbers.stream()
                                  .distinct()
                                  .limit(5)
                                  .skip(2)
                                  .collect(Collectors.toList());
        System.out.println("Skip two number from the list - "+skipList);
        
        //sorted using comparator
        List<Integer> sortedUsingComp = numbers.stream()
                                        .distinct()
                                        .sorted( (x,y)-> y-x)
                                        .collect(Collectors.toList());
        
        System.out.println("Soreted using compated Decneding List - "+sortedUsingComp);
        
    }

}
