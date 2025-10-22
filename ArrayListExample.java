import java.util.ArrayList;
// import java.util.List;

public class ArrayListExample {
    public static void main ( String[] args ){
        ArrayList<Integer> numbers = new  ArrayList<Integer>();
        numbers.add(0);
        numbers.add(100);
        numbers.add(40);

       // Retriving
        System.out.println(numbers.get(0));
        System.out.println("\n Iteration #1:");

        //loop iteration
        for( int i =0; i < numbers.size(); i++) {
            System.out.println (numbers.get(i));
        }

        //remove last item
        numbers.remove(numbers.size() - 1);

        //remove first  item - slow
        numbers.remove(0);

        System.out.println("\n Iteration #2:");

        for( Integer value: numbers){
            System.out.println(value);
        }

        // ArrayList for String and valid use of Interface List
        //List<String> values = new ArrayList<String>();

    }
}