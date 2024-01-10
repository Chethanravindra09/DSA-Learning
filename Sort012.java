import java.util.Arrays;

public class Sort012 {

    public static void main(String[] args) {
        
        int[] arr={0,1,2,2,0,2};
    
    int n=arr.length;
        // for(int i =0;i<n-1;i++){

        //     for(int j =0;j<n-1;j++){
        //         if(arr[j]>arr[j+1]){
        //         int temp=arr[j];
        //         arr[j]=arr[j+1];
        //         arr[j+1]=temp;
        //     }

        //     }
            
        // }

        int i =0;
        while(i<n){
            int j =0;
            while(arr[j]>arr[j+1]){
                if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                j++;
            }
            i++;
        }
        
}
System.out.println(Arrays.toString(arr));
    }
}