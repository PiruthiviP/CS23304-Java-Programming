/*To read the price of an item in decimal form like
 75.95 and print the output in paise (like 7595 paise) */

import java.util.Scanner;

public class pro15 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number:");
        double d= sc.nextDouble();
        int p = (int) (d * 100);
        System.out.println("the whole numebr is:"+p);

        
    }
}
