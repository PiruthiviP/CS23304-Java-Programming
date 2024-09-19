//Write a program to find out first non-repeated character from input String

import java.util.Scanner;

public class pro45 {

    public static char firstNonRepeatedChar(String str) {
        int[] freq = new int[256]; 

       
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;  
        }

        
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {  
                return str.charAt(i);
            }
        }

        return '\0'; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = firstNonRepeatedChar(input);

        if (result != '\0') {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }

        scanner.close();
    }
}
