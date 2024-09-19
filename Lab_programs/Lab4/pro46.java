//Program to reverse a String
import java.util.*;
class pro46 {
    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); 
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.nextLine();
        System.out.print("The reversed string is:"+reverse(str));
    }
    
}
