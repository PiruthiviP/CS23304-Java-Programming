//Program to delete the occurrence of a character from a String

import java.util.Scanner;

class pro47 {
    public static void del(String str,String word)
    {
       String result = "";  

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != word.charAt(0)) {
                result += str.charAt(i); 
            }
        }

        System.out.println("The word is: " + result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.nextLine();
        System.out.print("Enter the word to delete:");
        String s=sc.nextLine();
        del(str,s);
    }
}
