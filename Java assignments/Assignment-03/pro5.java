//. Write a Java Program to swap two string variables without using a temp variable.
import java.util.Scanner;

public class pro5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println(str1 + " " + str2);
    }
}
