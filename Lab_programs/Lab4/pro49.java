//Swap two strings without using a third string

import java.util.Scanner;

class pro49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string 1:");
        String str1=sc.nextLine();
        System.out.print("Enter the string 2:");
        String str2=sc.nextLine();
        str1 = str1 + str2; 
        str2 = str1.substring(0, str1.length() - str2.length()); 
        str1 = str1.substring(str2.length()); 
        System.out.print("The strings are:"+str1);
        System.out.print(str2);
        
    }
    
}
