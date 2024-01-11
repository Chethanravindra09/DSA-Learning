import java.util.ArrayList;
import java.util.Arrays;

public class AlternateNum {
    public static void main(String[] args) {

        int[] a={1, 2, -4, -5};
        int n = a.length;
        
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(a[i]<0){
                neg.add(a[i]);
            }
            else{
                pos.add(a[i]);
            }
        }

        for(int i =0;i<n/2;i++){
            a[2*i]=pos.get(i);
            a[2*i+1]=neg.get(i);
        }
       
        System.out.println(Arrays.toString(a));
    }
}
  