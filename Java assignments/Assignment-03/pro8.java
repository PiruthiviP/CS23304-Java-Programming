//. Write a Java Program to find the most repeated character in the given sentence.
import java.util.HashMap;
import java.util.Scanner;

public class pro8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : sentence.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        char mostRepeated = ' ';
        int maxCount = 0;
        for (char ch : map.keySet()) {
            if (map.get(ch) > maxCount) {
                maxCount = map.get(ch);
                mostRepeated = ch;
            }
        }
        System.out.println(mostRepeated);
    }
}

