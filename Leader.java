import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Leader {

    public static void main(String[] args) {
        

        int[] a = {187, 64 ,133, 62, 49 };
            List<Integer> arr = new ArrayList<>();
        HashSet<Integer> hash=new HashSet<>();
          
     
          for(int i =0;i<a.length;i++){

            
            boolean leader=true;

            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    leader=false;
                    break;
                }
            }
            if (leader) {
                hash.add(a[i]);
            }

}
for(int num:hash){
    arr.add(num);
}

Collections.sort(arr);


System.out.println(arr);
    }
}

