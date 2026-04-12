package JavaStream;
import java.util.*;
import java.util.stream.*;

public class IntermidiateOperations {
public static void main(String[] args) {
        
        List<List<String>> listOfList = List.of(
                List.of("Ramesh","Suresh", "Ahmand"),
                List.of("Raza","Parvez", "Sahil", "Hamid", "Shayan"),
                List.of("Anand","Shayan","Ankit","rahul")
            );
        System.out.println("Give the Input List of List");
        System.out.println(listOfList);
        System.out.println();
        
        // Flat Map
        List<String> resultStream = listOfList.stream()
                                    .flatMap(List :: stream)
                                    .map(str->str.toUpperCase())
                                    .collect(Collectors.toList());
        System.out.println("In the Single Nested List");
        System.out.println(resultStream);
        System.out.println();
        
        //Filer the Valure staring with char 'x'.
        List<String> filterList = listOfList.stream()
                                    .flatMap(List :: stream)
                                    .map(String::toUpperCase)
                                    .filter(str->str.startsWith("R"))
                                    .collect(Collectors.toList());
        System.out.println("Filter the String Strating with");
        System.out.println(filterList);
        System.out.println();
        
        System.out.println("Applying Multiple Intermidiate Operation");
        
        List<String> result = listOfList.stream()
                             .flatMap(List::stream)
                             .map(String::toUpperCase)
                             .filter(str->str.startsWith("S"))
                             .distinct()
                             .sorted()
                             .map(str -> str.concat("-Raza").toUpperCase())
                             .collect(Collectors.toList());
                             
        System.out.println(result);
        
    }

}
