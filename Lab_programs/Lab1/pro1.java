import java.util.*;
class pro1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number1:");
        int a=sc.nextInt();
        System.out.println("Enter the number 2:");
        int b=sc.nextInt();
        System.out.println("Eneter the number3");
        int c=sc.nextInt();
        int big= (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("The biggest number is:"+big);
        
    }
}