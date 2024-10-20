//3) Write a Java program to find the sum of first n numbers using while loop.
import java.util.*;
public class pro3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [40];
        System.out.println("Enter the number of elements to be entered");
        int n=sc.nextInt();
        System.out.println("Enter the numbers:");
        int i=0;
        for( i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        i=0;
        while(i<n)
        {
            sum+=arr[i];
            i++;
        }
        System.out.println("The sum of the numbers is"+sum);
        sc.close();
    }
    
    
}
