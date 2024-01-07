import java.util.Scanner;

public class HashMapNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");

        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter values into array");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        int hash[]= new int[256];

        for(int i =0;i<n;i++){
            hash[arr[i]]+=1;
        }

        System.out.println("Enter the how many numbers you need to do hash");
        int q = sc.nextInt();

        while(q!=0){
            System.out.println("Enter the value of number");
            int number=sc.nextInt();
            System.out.println("count of given number "+number+ " is " + hash[number]);
            q--;

        }
        sc.close();
    }
    
}







/*
 * n=5
 * {10,5,10,15,5,10}
 * q=5
 * 10
 * 5
 * 15
 * 5
 * 6
 * 
 * 
 */