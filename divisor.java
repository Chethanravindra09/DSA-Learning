import java.util.Arrays;

public class divisor {
    public static void main(String[] args) {

        int[] a = {3, 4, 4,7, 8, 10};
        int n=a.length;
        int x=8;
        int floor=0;
        int ceiling=Integer.MAX_VALUE;
        int[] arr= new int[2];
        for(int i =0;i<n;i++){
            if(a[i]<=x){
                floor=Math.max(floor, a[i]);
                arr[0]=floor;
            }
            else if(a[i]>=x){
                ceiling=Math.min(ceiling,a[i]);
                arr[1]=ceiling;
            }
            else{
                arr[0]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
