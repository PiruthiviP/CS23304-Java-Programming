//4) Write a Java program to print Fibonacci Sequence using do while loop
import java.util.*;
public class pro4 {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,i,count;
        Scanner sc=new Scanner(System.in);
        System.out.println("How manu numbers to be entered");
        count=sc.nextInt();    
 System.out.print(n1+" "+n2);    
    i=0; 
 do
 { i++;  
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }
    while(i<count);
   
    sc.close();
}
}
