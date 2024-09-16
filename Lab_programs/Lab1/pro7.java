import java.util.*;
import java.lang.Math;

public class pro7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: "); 
        float radius = sc.nextFloat();

        
        System.out.println("The area of the circle: " + (Math.PI * radius * radius));

        System.out.println("The diameter of the circle: " + (2 * radius));

       
        System.out.println("The circumference of the circle: " + (Math.PI * 2 * radius));
    }
}
