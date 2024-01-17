public class Fibonacci {

    static void fibonacci(int n) {

        int first = 0;
        int second = 1;
        int sum=0;
        System.out.print(first + ",");
        System.out.print(second + ",");
        for(int i =1;i<=n;i++){
            sum=first+second;
            System.out.print(sum + ",");
            first=second;
            second=sum;
        }
        System.out.print("");
    }


    public static void main(String[] args){
        fibonacci(7);

    }
}
