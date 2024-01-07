import java.util.Iterator;
import java.util.Stack;



public class StackInterface {
    public static void main(String[] args) {
        
        Stack<Integer> numbers  =  new Stack<>();
        

        numbers.push(2);
        numbers.push(4);
        numbers.push(5);
        numbers.push(9);

        Iterator<Integer> iter = numbers.iterator();

        while(iter.hasNext()){
            System.out.print(iter.next());
            System.out.print(",");
        }
        System.out.println();
        numbers.pop();
        System.out.println("Remaining Elements in stack after pop() : " +numbers);

        int firstEle= numbers.peek();
        System.out.println("First element in Stack : "+ firstEle);

        int position = numbers.search(2);
        System.out.println(position);
    }
}
