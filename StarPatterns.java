public class StarPatterns {

    static void pattern1(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = row; col < n; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        int num=1;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        int num=1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        int num=1;
        for(int row=1;row<=n;row++){
            for(int col=row;col<=n;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }

    static  void pattern8(int n){
        for(int row=1;row<=n;row++){
            for(int col=row;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for(int row=1;row<=n;row++){
            for(int col=row;col<=n;col++){
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }

    static  void pattern10(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" ");
            }
            for(int col=row;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static  void pattern11(int n){
        int num=1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" ");
            }
            for(int col=row;col<=n;col++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    static  void pattern12(int n){
        for(int row=1;row<=n;row++){
            int num=row;
            for(int col=1;col<=row;col++){
                System.out.print(" ");
            }
            for(int col=row;col<=n;col++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    static  void pattern13(int n){
        for(int row=1;row<=n;row++){
            int num=row;
            for(int col=row;col<=n;col++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    static  void pattern14(int n){
        for(int row=1;row<=n;row++){
            int num=row;
            for(int col=1;col<=row;col++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    static  void pattern15(int n){
        for(int row=1;row<=n;row++){
            for(int col=row;col>=1;col--){
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }

    static void pattern16(int n){
        char ch = 'A';
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        System.out.println("-----------------Pattern 1---------------------------------------");
        pattern1(4);
        System.out.println("-----------------Pattern 2---------------------------------------");
        pattern2(4);
        System.out.println("-----------------Pattern 3---------------------------------------");
        pattern3(4);
        System.out.println("-----------------Pattern 4---------------------------------------");
        pattern4(4);
        System.out.println("-----------------Pattern 5---------------------------------------");
        pattern5(3);
        System.out.println("-----------------Pattern 6---------------------------------------");
        pattern6(4);
        System.out.println("-----------------Pattern 7---------------------------------------");
        pattern7(4);
        System.out.println("-----------------Pattern 8---------------------------------------");
        pattern8(4);
        System.out.println("-----------------Pattern 9---------------------------------------");
        pattern9(4);
        System.out.println("-----------------Pattern 10--------------------------------------");
        pattern10(4);
        System.out.println("-----------------Pattern 11--------------------------------------");
        pattern11(4);
        System.out.println("-----------------Pattern 12--------------------------------------");
        pattern12(4);
        System.out.println("-----------------Pattern 13--------------------------------------");
        pattern13(4);
        System.out.println("-----------------Pattern 14--------------------------------------");
        pattern14(4);
        System.out.println("-----------------Pattern 15--------------------------------------");
        pattern15(4);
        System.out.println("-----------------Pattern 16--------------------------------------");
        pattern16(4);
    }
}
