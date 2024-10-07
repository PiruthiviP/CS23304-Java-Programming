/* Write a Java program to create an abstract class Employee with abstract methods 
calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend 
the Employee class and implement the respective methods to calculate salary and display 
information for each role 
 */

 abstract class Employee
 {
    abstract double calculateSalary(double x);
    abstract void displayInfo();

 }
 class Manager extends Employee
 {
    double calculateSalary(double x)
    {
        return x*12;

    }
    void displayInfo()
    {
        System.out.println("the manager salary is"+calculateSalary(1220));

    }
 }
 class Programmer extends Employee
 {
    double calculateSalary(double x)
    {
        return x*12;
    }
    void displayInfo()
    {
        System.out.println("the manager salary is"+calculateSalary(1000));

    }
 }
public class pro2 {
    public static void main(String[] args) {
        Employee e1=new Manager();
        e1.displayInfo();
        Employee e2=new Programmer();
        e2.displayInfo();
    }
    
}
