package Hashing;
import java.util.HashMap;;

public class HashMapOperations {
    public static void main(String[] args) {
        // create 
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        System.out.println(hm);

        // get O(1)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));

        // Containskey - O(1)

        System.out.println(hm.containsKey("China")); // true
        System.out.println(hm.containsKey("Indonesia")); // false

        // Remove - O(1)

        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // size 
        System.out.println(hm.size());

        // IsEmpty
        System.out.println(hm.isEmpty());

        
    }
}
