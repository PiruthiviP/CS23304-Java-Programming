public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        str1 = str1 + " World"; // Creates a new String object

        System.out.println("String result: " + str1);
    }
}
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Modifies the existing StringBuilder object

        String result = sb.toString(); // Convert to String if needed
        System.out.println("StringBuilder result: " + result);
    }
}
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("Vector contents: " + vector);
    }
}
