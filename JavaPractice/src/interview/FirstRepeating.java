package interview;
import java.util.Arrays;
import java.util.stream.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeating {
	public static void main(String[] args) {
		String str = "Swiss";
		
		String firstNonRepeatingChar = Arrays.stream(str.split(""))
				                       .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
				                       .entrySet()
				                       .stream()
				                       .filter(entry->entry.getValue()==1)
				                       .map(Map.Entry::getKey)
				                       .findFirst()
				                       .orElse(null);
	  System.out.println("First repeated char: "+firstNonRepeatingChar);
	
				                       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) +1);
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}

}
