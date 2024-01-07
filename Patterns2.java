public class Patterns2 {

    static void pattern1(int n){
        for(int i =0;i<2*n;i++){
             int row = i>n? 2*n-i:i;
            for(int j =0;j<n-row;j++){
                System.out.print(" ");
            }
            for(int j =0;j<row;j++){
                System.out.print(j+ " ");
            }
        
            System.out.println("");
        }
    }

    static void pattern2(int n){
        for(int i =0;i<2*n;i++){
             int row = i>n? 2*n-i:i;
            for(int j =0;j<row;j++){
                System.out.print("* ");
            }
        
            System.out.println("");
        }
    }

        
    static void pattern3(int n){
        for(int i =0;i<2*n;i++){
            int col=i>n?2*n-i:i;
            for(int j=0;j<2*(n-col);j++){
                System.out.print(" ");
            }
            for(int j =0;j<col;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i =0;i<2*n;i++){
             int row = i>n? 2*n-i:i;
            for(int j =0;j<row;j++){
                System.out.print("* ");
            }
        
            System.out.println("");
        }
    }

    static void pattern4(int rows){
        for (int i = 1; i <= rows; i++) {
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 1;j<=2*(rows-i);j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        int k =rows+1;
        for(int i =k;i<2*rows;i++){
            for(int j=0;j<2*rows-i;j++){
                System.out.print("*");
            }
            for(int j =1;j<=2*(i-rows);j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*rows-i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern5(int n){
        for(int i=1;i<2*n;i++){
           int col=i>n?i-n+1:n-i+1;
           for(int j =1;j<=col;j++){
            System.out.print("* ");
           }
            System.out.println("");
        }
    }
    
    static void pattern6(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                    System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern7(int n){
        for(int i =1;i<2*n;i++){
            int col=i>n?i-n+1:n-i+1;
            for(int j=1;j<=n-col;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern8(int n){
        for(int i =1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++){
                if(j==1||i==n||j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

   
    
    public static void main(String[] args) {
        

       pattern6(6);
       pattern3(6);
       pattern4(6);
          pattern8(5);
    }
}
