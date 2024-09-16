import java.util.Scanner;

public class pro2 {
    
    pu1blic static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.print("enter the number1:");
        int a=sc.nextInt();
        System.out.print("Enter the number 2:");
        int b=sc.nextInt();
        System.out.print("Eneter the number3:");
        int c=sc.nextInt();
        int big= (a<b)?((a<c)?a:c):((b<c)?b:c);
        System.out.println("The smallest number is:"+big);
        
    }
}
