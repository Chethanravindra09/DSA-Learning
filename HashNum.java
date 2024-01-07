import java.util.HashMap;

public class HashNum {
    public static void main(String[] args) {
       int arr[] = {10,5,10,15,10,5,5,6};
        
       HashMap<Integer,Integer> hash=new HashMap<>();

       for(int i =0;i<arr.length;i++){
        int count=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        hash.put(arr[i], count);
       }

       int maxCount = Integer.MIN_VALUE;
       int minCount = Integer.MAX_VALUE;
       int maxCountNum = -1;
       int minCountNum = -1;
       for(int key:hash.keySet()){
        int count= hash.get(key);
        if(count>maxCount){
            maxCount=count;
            maxCountNum=key;
        }

        if(count<minCount){
            minCount=count;
            minCountNum=key;
        }
       }
       System.out.println("Maximum frequency of number is :"+maxCountNum);
       System.out.println("Least frequency of number is :"+minCountNum);
    }
    
}
