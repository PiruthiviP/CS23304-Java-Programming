/* A set of two linear equations with two unknowns x1 and x2 is given below:
ax1 + bx2=m;  cx1 + dx2=n. the set has a unique solution x1= md-bn / ad-cd and x2=na-mc / ad-cd provided the denominator ad - cd is not equal to zero. Write a program that will read the values of constants a,b,c,d, m, and n and compute the values of x1 and x2. An appropriate message should be printed if ad - cb =0.
 */

 import java.util.Scanner;

 public class pro20 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.print("Enter the value of a: ");
         double a = scanner.nextDouble();
         System.out.print("Enter the value of b: ");
         double b = scanner.nextDouble();
         System.out.print("Enter the value of c: ");
         double c = scanner.nextDouble();
         System.out.print("Enter the value of d: ");
         double d = scanner.nextDouble();
         System.out.print("Enter the value of m: ");
         double m = scanner.nextDouble();
         System.out.print("Enter the value of n: ");
         double n = scanner.nextDouble();
 
         double denominator = a * d - c * b;
 
         if (denominator == 0) {
             System.out.println("The system has no unique solution.");
         } else {
             double x1 = (m * d - b * n) / denominator;
             double x2 = (n * a - m * c) / denominator;
 
             System.out.println("The value of x1 is: " + x1);
             System.out.println("The value of x2 is: " + x2);
         }
     }
 }