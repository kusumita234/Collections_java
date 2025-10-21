import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class LinkedListExample {
    public static void main ( String[] args){
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);

    }
    private static void doTimings ( String type, List<Integer> list){
        for ( int i=0; i<1E5; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();

        // 1#: add at the end of the list
        // for ( int i=0; i<1E5; i++){
        //     list.add(i);
        // }
        // Output for 1#
        //Time taken: 1 ms for ArrayList
        //Time taken: 4 ms for LinkedList


        //2# add at the begining of the list
          for ( int i=0; i<1E5; i++){
            list.add(0, i);
        }
        // Output for 2#
        // Time taken: 1389 ms for ArrayList
        // Time taken: 3 ms for LinkedList
        
        //3# add near the end of the list
        //   for ( int i=0; i<1E5; i++){
        //     list.add(list.size() - 100, i);
        // }

        // Output for 3#
        // Time taken: 3 ms for ArrayList
        // Time taken: 22 ms for LinkedList

        //4# add less than half way through the list
        // for ( int i=0; i<1E5; i++){
        //     list.add(900, i);
        // }

        // Output for 4#
        // Time taken: 1378 ms for ArrayList
        // Time taken: 156 ms for LinkedList

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms for " + type);

    }
}