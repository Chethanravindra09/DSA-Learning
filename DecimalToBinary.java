import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number to convert into Binary: ");
        int n=sc.nextInt();
        int num=n;
        ArrayList<Integer> bin = new ArrayList<>();
        int i = 0;
        while (n != 0) {
            int rem = n % 2;
            bin.add(rem);
            n = n / 2;
            i++;
        }
        System.out.print("Binary representation of Decimal number " + num +" is: " );
        for (int j = bin.size() - 1; j >= 0; j--) {
            System.out.print(bin.get(j));
        }
    }
}
