//Count the number of digits, alphabets, and special characters in a string
import java.util.Scanner;

class pro42 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int digit = 0, alphabets = 0, sp = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                digit++;
            } else if (Character.isAlphabetic(ch)) {
                alphabets++;
            } else if (!Character.isWhitespace(ch)) { 
                sp++; 
            }
        }

        System.out.println("The number of digits is " + digit);
        System.out.println("The number of alphabets is " + alphabets);
        System.out.println("The number of special characters is " + sp);
    }
}
