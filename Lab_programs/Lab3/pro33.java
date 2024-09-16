/*Write a program to print the area of two rectangles having
 sides (4,5) and (5,8) respectively
by creating a class named 'Rectangle' with a function named
 'Area' which returns the area.
Length and breadth are passed as parameters to its constructor.  */
class Rectangle
{
    int length,breadth;
    Rectangle(int length,int breadth)
    {
        this.breadth=breadth;
        this.length=length;
    }
    int area()
    {
        return length*breadth;
    }

}
public class pro33 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(4,5);
        Rectangle r2=new Rectangle(5, 8);
        System.out.println("The area is"+r1.area());
        System.out.println("The area is"+r2.area());
    }

    
}
