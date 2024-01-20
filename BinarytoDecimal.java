import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary to convert into Decimal: ");
        int n = sc.nextInt();
        int num = n;
        int Decimal=0;
        int i=0;
        while(n!=0){
            int rem = n %10;
            Decimal+=rem * Math.pow(2,i);
            i++;
            n=n/10;
        }
        System.out.println("Decimal number of given binary "+num+" is "+ Decimal);
        sc.close();
    }
}