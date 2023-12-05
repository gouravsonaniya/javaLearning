package Hashing;
import java.util.*;

public class IterationOnHashMap {
    public static void main(String[] args) {
         // create 
         HashMap<String, Integer> hm = new HashMap<>();

         
         hm.put("India", 100);
         hm.put("China", 150);
         hm.put("US", 50);
        
         // Iterate  O(1)
         // hm.entrySet()

         Set<String> keys = hm.keySet();
       //  System.out.println(keys);
        
         // foreach

         for (String K : keys) {
            System.out.println("kay = "+K+"," + "value = "+hm.get(K));
         }
    }
}
