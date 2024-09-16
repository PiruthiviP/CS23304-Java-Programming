/*Write a program to find the number
 of and sum of all integers greater than 100 and 
 less than 200 that are divisible by 7.
 */
public class pro19 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 101; i < 200; i++) {
            if (i % 7 == 0) {
                count++;
                sum += i;
            }
        }

        System.out.println("Number of integers divisible by 7: " + count);
        System.out.println("Sum of integers divisible by 7: " + sum);
    }
}