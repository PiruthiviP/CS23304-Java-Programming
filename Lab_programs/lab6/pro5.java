// 5. Write a java program using interface as 
// i) as variable type 
// ii) as method parameters 
// iii) as a return type of a method

interface Calculator {
    int add(int a, int b);
}

class SimpleCalculator implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class MathUtils {
    public void calculate(Calculator calc, int a, int b) {
        System.out.println(calc.add(a, b));
    }

    public Calculator getCalculator() {
        return new SimpleCalculator();
    }
}

public class pro5 {
    public static void main(String[] args) {
        Calculator calculator = new SimpleCalculator();
        MathUtils utils = new MathUtils();
        utils.calculate(calculator, 5, 3);

        Calculator newCalc = utils.getCalculator();
        System.out.println(newCalc.add(10, 7));
    }
}
