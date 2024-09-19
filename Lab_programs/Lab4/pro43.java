//Check if a string is a palindrome or not
import java.util.*;
class pro43 {
    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); 
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.nextLine();
        String str2=reverse(str);
        if(str.equals(str2))
        System.out.println("Its is palidrome");
        else
        System.out.print("not a palindrome");

    }    
}
