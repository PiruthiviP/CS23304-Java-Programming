// Write a Java Program to check if the term ‘MIT’ is present in a given string
import java.util.Scanner;

public class pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.contains("MIT")) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }
    }
}
