//Write a Java program to compute your age when you enter the year of birth
import java.util.*;

public class pro13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int birth,year;
        System.out.print("Enter your year of birth:");
        birth=sc.nextInt();
        System.out.print("Enter your current year:");
        year=sc.nextInt();
        System.out.print("Your cuurent age is:"+(year-birth));
        
    }
    
}
