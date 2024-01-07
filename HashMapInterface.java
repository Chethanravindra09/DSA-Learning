
import java.util.HashMap;


public class HashMapInterface {
    public static void main(String[] args) {
        HashMap<String, Integer> places = new HashMap<>();

        places.put("Bangalore", 1);
        places.put("Mysore", 2);
        places.put("Hassan", 3);
        places.put("Ballari", 4);
        System.out.println(places);

        places.replaceAll((key, value) -> value * 3);;
        
        System.out.println(places);

        places.computeIfAbsent("Hassan", key-> 100);
        places.merge("Hassan", 3, (key, value)-> 4* 3);
        places.remove("Ballari");
        places.put("Mangalore", 6);
        places.remove("Mangalore", 6);
       
        System.out.println(places.entrySet());
        
    }
    
}
