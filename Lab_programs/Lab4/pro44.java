//Check if a string only contains digits.
import java.util.*;
class pro44 {
     public static boolean isAllDigits(String str) {
    for (int i = 0; i < str.length(); i++) {
        if (!Character.isDigit(str.charAt(i))) {
            return false; 
        }
    }
    return true; 
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the string:");
    String str=sc.nextLine();
    if(isAllDigits(str))
    System.out.println("full of digits");
    else
    System.out.print("not full of digits");
}
    
}
