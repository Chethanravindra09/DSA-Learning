public class ArmstrongNum {
    public static void main(String[] args) {

        int num=153;
        int sum=0;
        int temp=num;
        int count=0;
        
        while(temp!=0){
            count++;
            temp=temp/10;
        }
        

        while(num!=0){
            int rem= num%10;
            sum=(int)(sum+Math.pow(rem,count));
            num=num/10;
        }
        
        System.out.println(sum);

    }
}





