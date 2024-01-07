import java.util.Arrays;

public class QuickSort {
public static void main(String[] args) {
    int[] arr={4,6,2,5,7,9,1,3};
    int n=arr.length;

    int j =n-1;
    for(int i =1;i<arr.length;i++){
        int pivot=arr[0];
        if(arr[i]>pivot&&arr[j]<pivot){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j--;
        }
    }
   int  i=n/2 -1;
        int temp=arr[0];
        arr[0]=arr[i];
        arr[i]=temp;

    

    System.out.println(Arrays.toString(arr));
}

    
}
