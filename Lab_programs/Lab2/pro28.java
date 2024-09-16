//Given a number, write a program using while
// loop to reverse the digits of a number. E.g. 12345 as 54321.

import java.util.Scanner;
public class pro28
{
  public static void main(String a[])
  {
      Scanner obj = new Scanner(System.in);
      System.out.println("enter the number:");
      int num= obj.nextInt();
      int b,rev=0;
      while(num!=0)
      {
          b=num%10;
          rev=(rev*10)+b;
          num=num/10;
      }
      System.out.println("reversed number is:"+rev);
  }
}