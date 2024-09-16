/* Given the list of marks ranging from 0 to 
100. Write a program to compute and print the number of 
students who have obtained marks in the range 81 to 100, 61 to 80, 41 to 60 and 0
 to 40. The program should use a minimum number of if statements. */
 import java.util.Scanner;

 public class pro21 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.print("Enter the number of students: ");
         int numStudents = scanner.nextInt();
 
         int[] marks = new int[numStudents];
 
         for (int i = 0; i < numStudents; i++) {
             System.out.print("Enter mark for student " + (i + 1) + ": ");
             marks[i] = scanner.nextInt();
         }
 
         int[] count = new int[4]; // count for each range
 
         for (int mark : marks) {
             if (mark >= 81) {
                 count[0]++;
             } else if (mark >= 61) {
                 count[1]++;
             } else if (mark >= 41) {
                 count[2]++;
             } else {
                 count[3]++;
             }
         }
 
         System.out.println("Number of students with marks 81-100: " + count[0]);
         System.out.println("Number of students with marks 61-80: " + count[1]);
         System.out.println("Number of students with marks 41-60: " + count[2]);
         System.out.println("Number of students with marks 0-40: " + count[3]);
     }
 }
