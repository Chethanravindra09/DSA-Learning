import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MisssingNum {
    public static void main(String[] args) {


        int a[]={1, 1, 2, 3, 3, 4, 4};
        int N=a.length;

        int n=missingNumber(a);
        System.out.println(n);

    }
    public static int missingNumber(int []arr) {
          // Outer loop that runs from 1 to N:
       int n=arr.length;
        int minCount=-1;

        HashMap<Integer,Integer> hash=new HashMap<>();

        for(int i =0;i<n;i++){
            int count =0;
            for(int j =0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            hash.put(arr[i],count);
        }
    System.out.println(hash);
            int minval=Integer.MAX_VALUE;
            for(int num:hash.keySet()){
                int count=hash.get(num);
                if(count<minval){
                    
                    minval=count;
                    minCount=num;
                }
            }
            return minCount;
        
        }
    }

