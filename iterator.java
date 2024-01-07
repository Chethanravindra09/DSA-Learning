import java.util.ArrayList;
import java.util.Arrays;


public class iterator {

    public static void main(String[] args) {
        String[] arr = {"1", "3", "5" , "6"};

        for (String str : arr) {
            System.out.print(str);
            System.out.print(" ");
          }

        ArrayList<String> numbers = new ArrayList<>(Arrays.asList(arr));
        System.out.println(numbers);
  // create an array of String type
  
        
    }

}
