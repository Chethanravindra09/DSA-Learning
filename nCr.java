import java.util.Scanner;

public class nCr {
    static int fact(int n) {
        return n > 1 ? n * fact(n - 1) : n;
    }

    static int nCrp(int n, int r) {

        int comb = fact(n) / (fact(n - r) * fact(r));

        return comb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        System.out.print("Enter the value of r:");
        int r = sc.nextInt();
        int combination = nCrp(n, r);
        System.out.print(n + "C" + r + " is " + combination);
        sc.close();
    }
}
