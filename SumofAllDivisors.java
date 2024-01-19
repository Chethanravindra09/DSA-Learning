public class SumofAllDivisors {
    static int sumOfDivisors(int n){
        int sum=0;
    for(int i =1;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
            return sum;
    }
    
public static int sumOfAllDivisors(int n){
    int sumof=0;
    for(int i=1;i<=n;i++){
           int nums= sumOfDivisors(i);
            sumof=nums+sumof;
        }
    return sumof;
    
}

    public static void main(String[] args) {
        int num=36;

        int sum= sumOfAllDivisors(num);
        System.out.println(sum);
    }
}
