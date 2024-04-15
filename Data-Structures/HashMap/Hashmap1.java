//Hashmap 
//Practical application - used in mongodb (key value pairs); blockchain
//modulus operator returns the remainder.
//Hashmap works on the functionality of modulus.

import java.util.HashMap;

public class Hashmap1 {
    public static void main(String[] args) {
        System.out.println("---HashMap---");
        // System.out.println("17 % 3 is " + 17 % 3); // checking modulus
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("grapes", 1);
        myMap.put("mango", 2);
        myMap.put("cherry", 3);
        System.out.println(myMap);
        System.out.println(myMap.containsValue(3)); // returns true as 3 is a value
        System.out.println(myMap.containsKey("grapes")); // returns true as grapes is a key
        System.out.println(myMap.containsKey("banana")); // returns false as banana is not a key

        System.out.println("--HashMap Key Set--");
        for (String myKey : myMap.keySet()) {
            System.out.println(myKey);
        } // KEYSET() to print keys
        System.out.println("--HashMap Values--");
        for (Integer myValue : myMap.values()) {
            System.out.println(myValue);
        } // values() to print keys
    }
}
