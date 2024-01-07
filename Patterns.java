

public class Patterns {

    public void pattern1(int n){
        for(int i =0; i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        } 
    }

    public void pattern2(int n){
        for(int i = 0; i<n;i++){
            for(int j =0; j<n;j++){
                if(i == 0 || j == 0 || i== n-1||j== n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void pattern3(int n){
        for(int i =0; i< n; i++){
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void pattern4(int n){
        for(int i =0; i<n;i++){
            for(int j = n;j>i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void pattern5(int n){
        for(int i = 0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void pattern6(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void pattern7(int n){
        for(int i = 0; i < n; i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void pattern8(int n){
        for(int i = 0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j =0;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void pattern9(int n){
        for(int i =0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j =0;j<n;j++){
                if(i==0||j==0||i == n-1||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void pattern10(int n){
        for(int i =0;i<n;i++){
            for(int j =0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j =0;j<n;j++){
                if(i==0||j==0||j==n-1||i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void pattern11(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(i==j||j==n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    public void pattern12(int n){
        for(int i =1;i<n;i++){
            for(int j = 1;j<n;j++){
                if(i==1||j==1||i==n-1||j==n-1 || i==j||j==n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void pattern13(int n){
        for(int i =1;i<n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }

    }
    public void pattern14(int n){
        for(int i =1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public void pattern15(int n){
        int num=1;
        for(int i =0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println("");
        }

    }

    public void pattern16(int n){
        for(int i =0;i<n;i++){
            for(int j =0;j<=i;j++){
                if((i+j)%2==0){
                System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public void pattern17(int n){
        for(int i =1;i<=n;i++){

            for(int j=0;j<2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for(int j = 2;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public void pattern18(int n){
        for(int i =0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=1;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void pattern19(int n){

    }
   
    public static void main(String[] args) {
        Patterns p1 = new Patterns();
        p1.pattern1(6);
        System.out.println("----------------------Next Pattern---------------------");
        p1.pattern2(6);
        System.out.println("----------------------Next Pattern---------------------");
        p1.pattern3(6);
        System.out.println("----------------------Next Pattern---------------------");
        p1.pattern4(6);
        System.out.println("----------------------Next Pattern---------------------");
        p1.pattern5(6);
        System.out.println("----------------------Next Pattern---------------------");
        p1.pattern6(6);
        System.out.println("----------------------Next Pattern---------------------");
        p1.pattern7(6);
        System.out.println("----------------------Next Pattern---------------------");
        p1.pattern8(6);
        System.out.println("----------------------Next Pattern---------------------");
        p1.pattern9(6);
        System.out.println("----------------------Next Pattern---------------------");
        p1.pattern10(6);
        System.out.println("----------------------Next Pattern---------------------");
        p1.pattern11(6);
        System.out.println("----------------------Next Pattern---------------------");
        p1.pattern12(6);
        System.out.println("----------------------Next Pattern---------------------");
        p1.pattern13(6);
        System.out.println("----------------------Next Pattern---------------------");
        p1.pattern14(6);
        System.out.println("----------------------Next Pattern---------------------");
        p1.pattern15(4);
        System.out.println("----------------------Next Pattern---------------------");
        p1.pattern16(4);
        System.out.println("----------------------Next Pattern---------------------");
        p1.pattern17(5);
        System.out.println("----------------------Next Pattern---------------------");
        p1.pattern18(4);
        System.out.println("----------------------Next Pattern---------------------");
        
        p1.pattern19(6);
        System.out.println("----------------------Next Pattern---------------------");
        
        
    }
}