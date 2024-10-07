//To implement method overloading based on the number of arguments. 

public class pro3 {
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+c+b;
    }
    float add(float a,float b)
    {
        return a+b;
    }
    
    public static void main(String[] args) {
        pro3 p=new pro3();
        System.out.println("The additon is "+p.add(3, 5));
        System.out.println("The addition is"+p.add(3,4,5));;
        System.out.println("The addition using the float "+p.add(17.99f,99.88f));
    }
}
