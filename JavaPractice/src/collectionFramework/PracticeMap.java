package collectionFramework;

import java.util.*;

public class PracticeMap {
	public static void main(String[] args) {
        System.out.println("HashMap Implementations");
        
        Map<Integer,String> mp = new HashMap<>();
        
        mp.put(null, "Check");
        mp.put(0, "Hello");
        mp.put(1, "World");
        mp.put(2, "Java");
        mp.put(3, "Programming");
        
        //Common Method which are using for HashMap.
        System.out.println(mp);
        System.out.println(mp.get(1));
        System.out.println("Is Map is Empty = " + mp.isEmpty());
        System.out.println("Size of Map is  = " + mp.size());
        System.out.println("Contains Key    = " + mp.containsKey(null));
        System.out.println("Contains Value  = " + mp.containsValue("Programming"));
        System.out.println("Romoved Key     = " + mp.remove(null));
        System.out.println("After Removed the key");
        System.out.println(mp);
        
        for(Map.Entry<Integer,String> itr : mp.entrySet()) {
            Integer key = itr.getKey();
            String value = itr.getValue();
            System.out.println("Key   : " + key);
            System.out.println("Value : " + value);
        }
        
        
    }

}
