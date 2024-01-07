import java.util.EnumMap;

class Doctor{

    Doctor(int n){
       System.out.println(this);
    }

}



public class Democlass {
    public static void main(String[] args){

        enum Sizes{
            SMALL, MEDIUM, LARGE, EXTRALARGE
        }
        EnumMap<Sizes, Integer> sizes = new EnumMap<>(Sizes.class);

        sizes.put(Sizes.SMALL, 28);
        sizes.put(Sizes.MEDIUM, 30);
        sizes.remove(Sizes.SMALL);
        
        System.out.println(sizes.entrySet());
       
    String name = "Hello this is String Example ";

    boolean check1= name.contains("this");
    System.out.println(check1);
    
   
    }    
}
