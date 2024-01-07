import java.util.Scanner;

public class GCD {
    

    static void approach1(int a , int b){
        int ans=1;
        for(int i =1;i<=Math.min(a,b);i++){
            if(a%i==0&&b%i==0){
                ans=i;
            }
        }
        System.out.println("GCD of "+a+" and "+b+ " is "+ans);

    }

    static void approach2(int a , int b){

        if(b==0){
            System.out.println("GCD is "+ a);
        }
        else{
            approach2(b, a%b);
        }

    }

    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b:");
        b=sc.nextInt();

        approach2(a, b);
        sc.close();
    }
}
