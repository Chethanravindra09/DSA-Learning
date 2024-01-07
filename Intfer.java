/**
 * Intfer
 */
public interface Intfer {

    default void perimeter(int... sides){
        int perimeter = 0;
        for(int side : sides){
            perimeter+=side;
        }
        System.out.println("Perimeter of triangele" + perimeter);
    
    }
}

/**
 * InnerIntfer
 */
class Triangle implements Intfer {
   private int a, b, c;
   private double s, area;

// initializing sides of a triangle
   Triangle(int a, int b, int c) {
      this.a = a;
      this.b = b;
      this.c = c;
      s = 0;
   }
     public void getArea() {
      s = (double) (a + b + c)/2;
      area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.println("Area: " + area);
   }
}