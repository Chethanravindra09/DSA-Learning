public class SubarraySum {
    public static void main(String[] args) {

        int arr[]= {-7, -8, -16, -4, -8, -5, -7, -11, -10, -12, -4 ,-6 ,-4 ,-16, -10 };
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        
		for(int i =0;i<n;i++){
			int sum=arr[i];
			for(int j=i;j<n-1;j++){
				sum+=arr[j+1];
				maxSum=Math.max(maxSum, sum);
			}
            maxSum=Math.max(maxSum, sum);
		}
		System.out.println(maxSum);
	}

}
 