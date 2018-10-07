import java.util.*;
public class FibonacciUsingRecursion 
{
    static int fibonacci(int a,int b,int n)
    {
        if(n>=0)
        {
            int c=a+b;
            a=b;
            b=c;
            return fibonacci(a,b,--n);
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.println("Nth term: "+fibonacci(a,b,n));
    }
    
}