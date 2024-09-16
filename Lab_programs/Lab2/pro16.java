/*To convert the given temperature in Fahrenheit
 to Celsius using the conversion formula: C=F-32/1.8 
 and display the values in tabular form.
 */

import java.util.Scanner;

public class pro16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter the temperatue in faherheit:");
        double F= sc.nextFloat();
        double Celsius= (F-32)/1.8;
        System.out.println("The celsius is"+Celsius);
        

    }
    
}
