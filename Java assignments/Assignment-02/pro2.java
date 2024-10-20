// 2) Write a Java program to find the maximum and minimum value of an array.
import java.util.*;
public class pro2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[60]; 
        System.out.print("How many numbers u want to enter?");
        int n=sc.nextInt();
        System.out.println("Enter the number of elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m=arr[0];
        int min=arr[0];


        for(int i=0;i<n;i++)
        {
            if(arr[i]>m)
            m=arr[i];
            if(arr[i]<n)
            min=arr[i];

        }
        System.out.println("The largest number is:"+m);
        System.out.println("The smallest number is:"+min);
    }
    
}
