/* Write a program that computes and prints a table of factorials for any given m.
 */
import java.util.Scanner;
import java.util.Formatter;
public class pro29
{
 public static void main(String s[])
 {
    Scanner obj= new Scanner(System.in);
    System.out.println("enter the number of terms:");
    int num=obj.nextInt();
    int fact=1,i;
    Formatter fmt=new Formatter();
    fmt.format("%15s %15s\n","Number","Factorial");
    for(i=1;i<=num;i++)
    {
        fact=fact*i;
        fmt.format("%15s %15s\n",i,fact);
    }
    
    System.out.print(fmt);
 }
}