import java.util.Scanner;

public class nPr {
        static int fact(int n) {
            return n > 1 ? n * fact(n - 1) : n;
        }

        static int nPr(int n, int r) {

            int perm = fact(n) / (fact(n - r));

            return perm;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n:");
            int n = sc.nextInt();
            System.out.print("Enter the value of r:");
            int r = sc.nextInt();
            int permutation = nPr(n, r);
            System.out.print(n + "P" + r + " is " + permutation);
        }
    }


