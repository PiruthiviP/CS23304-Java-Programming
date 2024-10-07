class Calculator {

    int add(int a, int b) {
        return a + b;
    }
    

    double add(double a, double b) {
        return a + b;
    }
  
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    double add(int a, double b) {
        return a + b;
    }
    
    double add(double a, int b) {
        return a + b;
    }
}

public class pro4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Add two integers: " + calc.add(5, 10));            // Calls int add(int, int)
        System.out.println("Add two doubles: " + calc.add(5.5, 10.5));        // Calls double add(double, double)
        System.out.println("Add three integers: " + calc.add(5, 10, 15));     // Calls int add(int, int, int)
        System.out.println("Add int and double: " + calc.add(5, 10.5));       // Calls double add(int, double)
        System.out.println("Add double and int: " + calc.add(5.5, 10));       // Calls double add(double, int)
    }
}
