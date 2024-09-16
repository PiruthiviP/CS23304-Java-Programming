/*To find a) area=pi*r*r+2*pi*r*h  		b) energy = mas(acceleration *height +velocity2 / 2)
 */
import java.util.Scanner;
public class Pro17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        int r = sc.nextInt();
        System.out.print("Enter the height: ");
        int h = sc.nextInt();

        double area = Math.PI * r * r + 2 * Math.PI * r * h;
        System.out.println("The area is: " + area);

        System.out.print("Enter the mass: ");
        int mass = sc.nextInt();
        System.out.print("Enter the acceleration: ");
        int acceleration = sc.nextInt();
        System.out.print("Enter the velocity: ");
        int velocity = sc.nextInt();
        System.out.print("Enter the height: ");
        int height = sc.nextInt();

        double energy = mass * (acceleration * height + velocity * velocity / 2);
        System.out.println("The energy is: " + energy);
    }
}