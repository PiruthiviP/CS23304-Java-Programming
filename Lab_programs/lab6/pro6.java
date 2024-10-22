// 6. What are the built-in interfaces in java? Demonstrate it with an example for each.

import java.util.function.Predicate;
import java.util.Comparator;
import java.util.function.Consumer;

public class pro6 {
    public static void main(String[] args) {
        // Predicate example
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println(isEven.test(4));

        // Comparator example
        Comparator<String> compareLength = (s1, s2) -> s1.length() - s2.length();
        System.out.println(compareLength.compare("apple", "banana"));

        // Consumer example
        Consumer<String> printMessage = (msg) -> System.out.println(msg);
        printMessage.accept("Hello, World!");
    }
}
