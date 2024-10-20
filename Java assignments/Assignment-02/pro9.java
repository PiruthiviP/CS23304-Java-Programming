//9) Write a Java program to get input using an array and print the array values in reverse order.

import java.util.Scanner;

public class pro9 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to enter");
        int n=sc.nextInt();
        int arr[]=new int[80];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements are");
        for(int i=0;i<n;i++)
        {
            
            System.out.println(arr[i]);
        }

        System.out.println("The elements in the reverse order");

        for(int i=n-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
    
}
