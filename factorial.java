import java.util.Scanner;

public class factorial {
    static int fact(int n) {
        return n>1?n*fact(n-1):n;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int fact = fact(n);
        System.out.print("Factorial of " + n + " is " + fact);
    }
}
