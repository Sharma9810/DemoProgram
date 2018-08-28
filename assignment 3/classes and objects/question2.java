import java.util.*;
class Complex
{
    int r,i;
    Scanner sc=new Scanner(System.in);
    void ComplexNumber()
    {
        System.out.print("Enter Real Part: ");
        r=sc.nextInt();
        System.out.print("Enter Imaginary Part: ");
        i=sc.nextInt();
    }
    void Display()
    {
        System.out.println("Entered Complex Number:\n"+r+"+"+i+"i");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Complex ob=new Complex();
        ob.ComplexNumber();
        ob.Display();
    }
    
}