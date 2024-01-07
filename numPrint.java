public class numPrint {
   public static int sum=0;
    static int print(int n){
        if(n==0){
            return 1;
        }
    
       return n*print(n-1);
    }

    public static int[] generateFibonacciNumbers(int n) {
        int[] fib=new int[n+1];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib;
}
    public static void main(String[] args) {
       
        // int summ=print(7);
        // System.out.println(summ);

       int[] nums= generateFibonacciNumbers(5);
       System.out.println(nums);
    }
}
