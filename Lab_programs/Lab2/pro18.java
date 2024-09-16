/*In inventory management, the economic order quantity for a single item is given by
EOQ= sqrt(2*demand rate*setup costs/holding
 cost per unit time) and the optimal time between orders is TBO = sqrt(2*setup costs/demand rate * holding cost per item per unit time), Write a Java program to compute EOQ and TBO, given demand rate (items per unit time), 
setup costs (per order) and the holding cost ( per item per unit time).*/
import java.util.Scanner;

public class pro18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the demand rate (items per unit time): ");
        double demandRate = scanner.nextDouble();
        System.out.print("Enter the setup costs (per order): ");
        double setupCosts = scanner.nextDouble();
        System.out.print("Enter the holding cost (per item per unit time): ");
        double holdingCost = scanner.nextDouble();

        double eoq = Math.sqrt(2 * demandRate * setupCosts / holdingCost);
        double tbo = Math.sqrt(2 * setupCosts / (demandRate * holdingCost));

        System.out.println("The Economic Order Quantity (EOQ) is: " + eoq);
        System.out.println("The Time Between Orders (TBO) is: " + tbo);
    }
}
