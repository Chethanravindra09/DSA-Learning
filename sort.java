
public class sort {
    public static void main(String[] args) {
        int[] v ={2, 2, 1, 3, 1, 1, 3, 1, 1};
            
         
       
        int maxCount=Integer.MIN_VALUE;
        for(int i =0;i<v.length;i++){
            int value=0;
            for(int j =0;j<v.length;j++){
                if(v[i]==v[j]){
                    value++;
                    
                    maxCount=Math.max(maxCount, value);
                }
            }
    }
    System.out.println(maxCount);
}
}
   