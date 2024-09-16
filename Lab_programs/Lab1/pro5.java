import java.util.*;

class pro5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month:");
        int num = sc.nextInt();
        int days = 0;

        switch (num) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = 28; 
                break;
            default:
                System.out.println("Invalid month number!");
                return;
        }

        System.out.println("Number of days: " + days);
    }
}
