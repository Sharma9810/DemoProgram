import java.util.*;
class Rectangle
{
    Scanner sc=new Scanner(System.in);
    double l,b;
    void CalculateArea()
    {
        System.out.print("Enter Length: ");
        l=sc.nextDouble();
        System.out.print("Enter Breadth: ");
        b=sc.nextDouble();
        System.out.println("Area of Rectangle: "+(l*b));
    }
}
public class Assignment
{
    public static void main(String[] args)
    {
        Rectangle ob=new Rectangle();
        ob.CalculateArea();
    }
}