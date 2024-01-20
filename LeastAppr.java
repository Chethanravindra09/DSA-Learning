public class LeastAppr {
    public static void main(String[] args) {
        

        int arr[]={-1, 1, 1};

        int n = arr.length;

        int k =1;
        
      
      int length=0;
        for(int i =0;i<n;i++){
            int sum=0;
            for(int j =i;j<n;j++){
                    sum+=arr[j];
                    if(sum==k){
                    int curlength=j-i+1;

                    length=Math.max(length,curlength);
            }
        }
    }

    System.out.println((length>0)?length:-1);



    }
}

