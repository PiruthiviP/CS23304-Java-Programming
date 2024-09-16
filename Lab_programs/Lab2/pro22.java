/* Admission to a professional course is 
subject to the following conditions: Marks in 
Mathematics >= 60, Marks in physics >= 50, marks in 
Chemistry >= 40, Total in all three subjects >= 200 (or) total
 in mathematics and physics >= 200. Given the marks in the 3 subjects,
 write a program to process the applications to list the eligible candidates. */
 import java.util.Scanner;

 public class pro22 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.print("Enter the number of applicants: ");
         int numApplicants = scanner.nextInt();
 
         for (int i = 0; i < numApplicants; i++) {
             System.out.print("Enter Mathematics mark for applicant " + (i + 1) + ": ");
             int mathMark = scanner.nextInt();
             System.out.print("Enter Physics mark for applicant " + (i + 1) + ": ");
             int physicsMark = scanner.nextInt();
             System.out.print("Enter Chemistry mark for applicant " + (i + 1) + ": ");
             int chemistryMark = scanner.nextInt();
 
             if ((mathMark >= 60) && (physicsMark >= 50) && (chemistryMark >= 40) &&
                     ((mathMark + physicsMark + chemistryMark >= 200) || (mathMark + physicsMark >= 200))) {
                 System.out.println("Applicant " + (i + 1) + " is eligible.");
             } else {
                 System.out.println("Applicant " + (i + 1) + " is not eligible.");
             }
         }
     }
 }
