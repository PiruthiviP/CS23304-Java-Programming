import java.util.Scanner;
//6. Write a Java Program to find the number of the words in the given sentence.
public class pro6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split("\\s+");
        System.out.println(words.length);
    }
}
