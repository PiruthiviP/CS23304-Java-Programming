
//box values//
public class pro23 {
    public static void main(String[] args) {
        System.out.println("  | 0.0 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9");
        System.out.println("--+-------------------------------------------");
        for (double i = 0.0; i <= 9.0; i++) {
            System.out.print(String.format("%.1f", i) + " | ");
            for (double j = 0.0; j <= 0.9; j++) {
                double num = i + j;
                System.out.print(String.format("%.4f ", Math.sqrt(num)));
            }
            System.out.println();
        }
    }
}