//5. To overload the main() method. 

public class pro5 {

   
    public static void main(String[] args) {
        System.out.println("Standard main method called.");
        main(5);         
        main("Hello");      
    }

  
    public static void main(int num) {
        System.out.println("Overloaded main method called with an integer: " + num);
    }

   
    public static void main(String message) {
        System.out.println("Overloaded main method called with a String: " + message);
    }
}
