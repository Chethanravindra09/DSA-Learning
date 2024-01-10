import java.util.HashMap;

public class LeastAppr {
    public static void main(String[] args) {
        

        int arr[]={-3,-2,-2,-3};

        int n = arr.length;

        
        
      
      int length=0;
      int newSum=0;
        for(int i =0;i<n;i++){
            int sum=0;
            for(int j =i;j<n;j++){
                    sum+=arr[j];
                    newSum=Math.max(newSum, sum);
                    if(sum==newSum){
                    int curlength=j-i+1;
                    length=Math.max(length,curlength);
            }
        }
    }

    System.out.println((length>0)?newSum:-1);



    }
}

