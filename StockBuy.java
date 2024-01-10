public class StockBuy {
    public static void main(String[] args) {
        int[] arr={7, 7, 9, 8, 6, 7, 6, 10, 5 };

        int n =arr.length;
        int MaxProfit=Integer.MIN_VALUE;
        int leastBuy=Integer.MAX_VALUE;
        int profit =0;
        int k=0;
        for(int i =0;i<n-1;i++){
                if(arr[i]>MaxProfit){
                    leastBuy=Math.min(leastBuy,arr[i]);
                    if(arr[i]==leastBuy){
                        k=i;
                    }
                }
        }
        
                for(int j =k;j<n;j++){
                    profit=arr[j]-leastBuy;

                    MaxProfit=Math.max(MaxProfit,profit);
                    
                }
                System.out.println(MaxProfit>0?MaxProfit:0);
            }
        
    }
    

