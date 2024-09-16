//Write a java program to illustrate the working of static classes and methods.


public class pro40 {
    // Static nested class
    public static class StaticNestedClass {
        public static void printMessage() {
            System.out.println("This is a static nested class");
        }
    }

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method");
    }

    public static void main(String[] args) {
        // Accessing static nested class and method
        StaticNestedClass.printMessage();

        // Accessing static method
        pro40.staticMethod();

        // Creating an instance of the outer class
        pro40 outer = new pro40();

        // Cannot access static method through instance
        // outer.staticMethod(); // This will give a warning

        // Cannot access static nested class through instance
        // outer.StaticNestedClass.printMessage(); // This will give a warning
    }
}