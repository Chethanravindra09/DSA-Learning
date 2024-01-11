import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class nextPerm {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        
        System.out.println(arr);
        nextGreaterPermutation(arr);

        System.out.println(arr);
    }
    
       public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        // Write your code here.
        int n=A.size();
        int i , j;
        

        //Step 1 to find the pivot ,while travese from n-2
         for(i =n-2;i>=0;i--){
             if(A.get(i)<A.get(i+1)){
                 break;
             }
            }

             if(i<0){
                 reverse(A,0,n-1);
             }
             else{
                 for(j=n-1;j>i;j--){
                     if(A.get(j)>A.get(i)){
                         break;
                     }
                 }
                 swap(A,i,j);
             reverse(A,i+1,n-1);
             }
         

         return A;
          
    }

    
    public static void  swap(List<Integer> A, int i, int j){
        int temp=A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }

    public static void reverse(List <Integer> A, int i , int j){
        while (i<j){
            swap(A,i,j);
            i++;
            j--;
        }
    }

    
}