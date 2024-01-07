import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            boolean swaped=false;
            for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swaped=true;
            }
        }
        if(!swaped){
            break;
        }
    }
        System.out.println(Arrays.toString(arr));
    }
}
