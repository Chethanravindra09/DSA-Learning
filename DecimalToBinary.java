import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> bin = new ArrayList<>();
        int i = 0;
        while (n != 0) {
            int rem = n % 2;
            bin.add(rem);
            n = n / 2;
            i++;
        }
        for (int j = bin.size() - 1; j >= 0; j--) {
            System.out.print(bin.get(j));
        }
    }
}