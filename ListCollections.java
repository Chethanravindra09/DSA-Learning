
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListCollections {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbers1 = new ArrayList<>();

        //List interface add() method.
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);

        System.out.println(numbers);
        Collections.reverse(numbers);
        //List interface addAll() method.
        numbers1.addAll(numbers);
        System.out.println(numbers1);

        //list interface get() method.

        int value = numbers.get(3);
        System.out.println(value);

        //list interface iterator() method.
        Iterator<Integer> iter = numbers.iterator();

        while(iter.hasNext()){
            System.out.print(iter.next());
            System.out.print(",");
        }
        
        System.out.println();

        numbers.set(2, 7);
        System.out.println(numbers);

        numbers1.clear();
        System.out.println(numbers1);

        int n =  numbers.size();
        System.out.println(n);

        

        String arr = numbers.toString();
        
        System.out.println(arr);

        for(int num : numbers){
            System.out.print(num);
            System.out.print(",");
        }

        



    }
    
}
