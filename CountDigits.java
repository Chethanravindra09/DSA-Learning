
    // Java code O(n*k) solution for finding maximum sum of
// a subarray of size k
class CountDigits {

	static void reverseNum(int n){
		int temp = n;
		int rev=0;

		while(temp!=0){
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==n){
			System.out.println("Palindrome Number");
		}
		else{
			System.out.println("Not a Palindrome Number");
		}
	}

	static void rotate(int[] nums, int k) {
        
        int n=nums.length;
        for(int i =0;i<=k;i++){
            nums[n]=nums[i];
        }

		
        for(int i =0;i<nums.length;i++){
			System.out.print(nums[i]);
		}
    }

	public static void main(String[] args) {
		int n=121;
		int[] nums={1,2,3,4,5,6,7};
		reverseNum(n);
		rotate(nums, 3);
	}
}
	

