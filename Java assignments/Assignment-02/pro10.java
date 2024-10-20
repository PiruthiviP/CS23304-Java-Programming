/* 10) Write a Java method to check whether a string is a valid password. Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.
*/

import java.util.Scanner;

public class pro10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password to validate:");
        String s = sc.next();
        
        boolean isValid = true;
        int digitCount = 0;

        if (s.length() < 10) {
            isValid = false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (!Character.isLetterOrDigit(ch)) {
                isValid = false;
                break;
            }
            
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        if (digitCount < 2) {
            isValid = false;
        }

        if (isValid) {
            System.out.println("Valid password");
        } else {
            System.out.println("Not a valid password");
        }
    }
}
