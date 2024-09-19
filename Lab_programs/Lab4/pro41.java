//Check if two strings are anagrams of each other
import java.util.*;
public class pro41
{
public static String SortString(String str)
  {
    char c[] = str.toCharArray();
    Arrays.sort(c);
    return new String(c);
  }
public static boolean checkAnagrams(String str1, String str2)
  {
    
    if (str1.length() != str2.length())
      return false;
 
    str1 = SortString(str1);
    str2 = SortString(str2);
 
    
    for (int i = 0; i < str1.length(); i++)
    {
      if (str1.charAt(i) != str2.charAt(i))
        return false;
    }
    return true;
  }
public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str1, str2;
    System.out.print("Enter the string 1:");
    str1=sc.nextLine();
    System.out.print("Enter the string 2:");
    str2=sc.nextLine();

    System.out.println(checkAnagrams(str1, str2));
  }
}