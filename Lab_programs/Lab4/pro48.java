//Program to extract a portion of a character string and print the extracted string. Assume that m
//characters are extracted, starting with the nth character.
import java.util.Scanner;

class pro48 {
    public static void extractPortion(String str, int start, int length) {
        String result = "";  

        
        for (int i = start - 1; i < start - 1 + length && i < str.length(); i++) {
            result += str.charAt(i);
        }

        System.out.println("Extracted string: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter the starting position (n): ");
        int n = sc.nextInt();
        
        System.out.print("Enter the number of characters to extract (m): ");
        int m = sc.nextInt();
        
        extractPortion(str, n, m);  
        sc.close();
    }
}

