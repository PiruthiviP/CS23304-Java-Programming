/*Write a Java program to demonstrate method overriding with a subclass that overrides a 
method and calls the superclass method using the super keyword  */

class base
{
    int x;
    base(int x)
    {
        this.x=x;
    }
    void display()
    {
        System.out.println("im in the base class method");
    }
}
class child extends base

{
    int y;
    child(int x,int y)
    {
       
        super(x);
        this.y=y;
    }
    void display()
    {
        super.display();
        System.out.println("im a base class method");
    }

}
public class pro7
{
    public static void main(String[] args) {
        child c=new child(3,7);
        c.display();
    }
}