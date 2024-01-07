import java.util.Arrays;



class Demo{
    public static void main(String[] args){
        int[][] souArray = {
            {1, 2, 3, 4}, 
            {5, 6},
            {0, 2, 42, -4, 5}
            };

            
            int[][] destArray = new int[souArray.length][];

            for(int i = 0; i< destArray.length; i++){
                destArray[i]=new int[souArray[i].length];
                for(int j =0;j<destArray[i].length;j++){
                    destArray[i][j]=souArray[i][j];
                }
            }
            
            System.out.println(Arrays.deepToString(souArray));


    }
}