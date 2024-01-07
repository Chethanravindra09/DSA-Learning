import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrSort {
    public static Object[] rotateArray(int[] arr, int k) {
        
        ArrayList<Integer> arr1=new ArrayList<>();
        
        for(int i=k+1;i<arr.length;i++){
            arr1.add(arr[i]);
        }

        for(int i=0;i<=k;i++){
            arr1.add(arr[i]);
        }

        return arr1.toArray();
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};


        Object[] arr1=rotateArray(arr, 3);
        System.out.println(Arrays.toString(arr1));
    }
}
