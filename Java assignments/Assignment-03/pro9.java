//9. Write a Java Program to replace the spaces in the given string with ‘CT’
import java.util.Scanner;

public class pro9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(sentence.replace(" ", "CT"));
    }
}
