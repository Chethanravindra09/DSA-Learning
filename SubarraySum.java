public class SubarraySum {
    public static void main(String[] args) {

        int arr[]= {-7, -8, -16, -4, -8, -5, -7, -11, -10, -12, -4 ,-6 ,-4 ,-16, -10 };
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        int min_sum=0;
		for(int i =0;i<n;i++){
            min_sum=min_sum+arr[i];
            if(maxSum<min_sum){
                maxSum=min_sum;
            }

            if(min_sum<0){
                min_sum=0;
            }			

		
	}
System.out.println(maxSum>=0?maxSum:0);
}
}
 