import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


// public class Temp{

// }

public class SortedMapExample {
    public static void main ( String[] args){
        Map<Integer, String> hashMap = new HashMap< Integer, String> ();
        Map<Integer, String> linkedHashMap = new LinkedHashMap< Integer, String> ();
        Map<Integer, String> treeMap = new TreeMap< Integer, String> ();

        // to check the print of a class who do not have the hashcode() function
        System.out.println("Check Print out if the class do not have hash code function");
        System.out.println (new Temp());
        
        // to check the order of print for HashMap - which is random
        System.out.println("Iteration #1 with HashMap");
        testMap(hashMap);

        // to check the order of print for LinkedHashMap - which is as per the orer of insertion
        System.out.println("Iteration #2 with LinkedHashMap");
        testMap(linkedHashMap);

        // to check the order of print for TreeMap - which is of natural order of the key
        System.out.println("Iteration #3 with TreeMap");
        testMap(treeMap);

    }
    
    public static void testMap(Map<Integer, String> map){

        map.put(9, "Nine");
        map.put(4, "Four");
        map.put(8, "Eight");
        map.put(1, "One");
        map.put(0, "Zero");
        map.put(15, "Fifteen");
        map.put(6, "Six");


        for ( int key : map.keySet()){
            String value = map.get(key);
            System.out.println("Key = "+ key + " Value : "+ value);
        }

    }
}