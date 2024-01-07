

public class NumPattern {

static void pattern1(int n){
    for(int i =1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j + " ");
        }
        System.out.println("");
    }
    
} 

static void pattern2(int n){
    for(int i =1;i<=n;i++){
        for(int j=i;j<=n;j++){
            System.out.print(" ");
        }
        for(int j =1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}

static void pattern3(int n){
    for(int i =1;i<=n;i++){
        for(int j=i;j<=n;j++){
            System.out.print(j+" ");
        }
        System.out.println("");
    }
}

static void pattern4(int n){
    int num=1;
    for(int i=0;i<n;i++){
        for(int j =0;j<=i;j++){
            System.out.print(num+" ");
            num++;
        }
        System.out.println("");
    }
}

static void pattern5(int n){
    for(int i =0;i<n;i++){
        for(int j =0;j<=i;j++){
            if(i==j||(i+j)%2==0){
                System.out.print("1 ");
            }
            else{
                System.out.print("0 ");
            }
        }
        System.out.println("");
    }
}

static void pattern6(int n){
    for(int i=1;i<=n;i++){
        for(int j=i;j<=2*n-i;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
        for(int j =2;j<=i;j++){
            System.out.print(j+ " ");
        }
        System.out.println("");
    }
}

static void pattern7(int n){
    for(int i =1;i<=n;i++){
        for(int j =1;j<=i;j++){
            System.out.print(" ");
        }
        for(int j =i;j<=n;j++){
            System.out.print(j+" ");
        }
        System.out.println("");
    }
}

static void pattern8(int n){
    for(int i =1;i<2*n;i++){
        int col=i>n?i-n+1:n-i+1;
        
        for(int j=0;j<n-col;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=col;j++){
            System.out.print(j+" ");
        }
        System.out.println("");
    }
}

static void pattern9(int n){
    for(int i=1;i<=n;i++){
        for(int j =1;j<i;j++){
            System.out.print(" ");
        }
        for(int j=i;j<=n;j++){
            System.out.print(j+" ");
        }
        System.out.println("");
    }
    for(int i=n-1;i>=1;i--){
        for(int j=1;j<i;j++){
            System.out.print(" ");
        }
        for(int j=i;j<=n;j++){
            System.out.print(j+" ");
        }
        System.out.println("");
    }
}

static void pattern10(int n){
    for(int i =n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
}

static void pattern11(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println("");
    }

    for(int i =n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
}

static void pattern12(int n){
    for(int i=1;i<=2*n-1;i++){
        int col=i>n?2*n-i:i;
        for(int j=0;j<col;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
}

static void pattern13(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+"");
        }
        for(int j=1;j<=2*(n-i)-1;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j+"");
        }
        System.out.println("");
    }
}
public static void main(String[] args) {

    pattern13(3);
        
    }
    
}


