import java.util.Scanner;

public class Conditionals {
    public static void main(String[]  args){


        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a , b, c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("A is greater");
            }
            else{
                System.out.println("C is greater");
            }
        }
        else if (b>c){
            System.out.println("B is greater");
        }
        else if(c>b){
            System.out.println("C is greater");
        }
        else {
            System.out.println("All are equal");
        }

    }
}
