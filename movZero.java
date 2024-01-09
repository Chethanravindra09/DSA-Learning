import java.util.ArrayList;
import java.util.Arrays;

public class movZero {
    public static void main(String[] args) {
        int[] arr ={1, 2, 0, 0, 2, 3};

        int n =arr.length;

        int[] newArr= moveZeros(n, arr);
        System.out.println(Arrays.toString(newArr));
    }
    public static int [] moveZeros(int n, int []a) {
    

        ArrayList<Integer> arr=new ArrayList<>();

    for(int i =0;i<n;i++){
        if(a[i]>0){
            arr.add(a[i]);
        }
    }
    for(int i =0;i<n-1;i++){
        if(a[i]==0){
            arr.add(a[i]);
        }
    }
    int ar[] = new int[arr.size()];
    for(int i=0;i<arr.size();i++){
        ar[i]=arr.get(i);
    }


    return ar;
}
    
}
