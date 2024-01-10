import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class numMoveByOnePlace {
    public static void main(String[] args) {

        int a[] ={1,2,3,4,5};
        int b[] = {1,3,4,5,2};

         HashSet<Integer> hash= new HashSet<>();
            
            for(int i =0;i<a.length;i++){
                if(!hash.contains(a[i])){
                    hash.add(a[i]);
                }
            }

            for(int i =0;i<b.length;i++){
                if(!hash.contains(b[i])){
                    hash.add(b[i]);
                }
            }
           
ArrayList<Integer> arr=new ArrayList<>();

  Iterator<Integer> itr=hash.iterator();


    }

}
