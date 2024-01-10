import java.util.Arrays;

public class AlternateNum {
    public static void main(String[] args) {

        int[] a={1, 2, -4, -5};
        int n = a.length;
        int j =0;
        int[] temp = new int[n];
        for(int i =0;i<=n-1;i++){

            if(i%2==0){
                temp[j]=a[i];
                j++;
            }
            if(i%2!=0){
                temp[j]=a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
  