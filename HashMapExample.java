import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main ( String[] args){
        HashMap<Integer, String> map = new  HashMap<Integer, String> ();

        map.put(5, "Five");
        map.put(8, "Eight");
        map.put(6, "Six");
        map.put(4, "Four");
        map.put(2, "Two");

        String text = map.get(6);
        System.out.println(text);

        // Output for a key not present
        System.out.println(map.get(1));

        //Overwrite value for existing Key
        map.put(6, "Hello");
        System.out.println(map.get(6));

        //for each loop
        for ( Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            //Note: The print is random for hashmap -> Not necessrily in ascending or descending order
            System.out.println("Key = " + key + " Value = " + value);

        }

    }
    
}
