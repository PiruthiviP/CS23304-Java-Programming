

//1.Write a Java Program to count the total number of a vowel in a given paragraph. Get the paragraph as input from the user.
import java.util.Scanner;

public class pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paragraph = sc.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < paragraph.length(); i++) {
            char ch = paragraph.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
