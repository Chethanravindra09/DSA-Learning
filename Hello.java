import java.util.Scanner;

class Hello{
    public static void main(String[] args){
      
    int sum = 0;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // take integer input from the user
    System.out.println("Enter a number");
    int number = input.nextInt();
	   
    // while loop continues 
    // until entered number is positive
    first:
    while (number >= 0) {
      // add only positive numbers
      sum += number;
      if(sum>10){
        continue first;
      }
      System.out.println("Enter a number");
      number = input.nextInt();
    }
	   
    System.out.println("Sum = " + sum);
    input.close();
}
}