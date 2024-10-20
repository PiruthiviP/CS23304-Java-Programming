//7. Write a Java Program to find the duplicate words in the given sentence.
import java.util.HashMap;
import java.util.Scanner;

public class pro7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().toLowerCase();
        String[] words = sentence.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : map.keySet()) {
            if (map.get(word) > 1) {
                System.out.println(word);
            }
        }
    }
}
