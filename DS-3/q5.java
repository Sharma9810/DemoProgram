import java.util.*;
public class SumOfDigitsOfStringUsingRecursion 
{
    static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return(n%10+sum(n/10));
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String num=sc.next();
        int n=Integer.parseInt(num);
        int s=sum(n);
        System.out.println("Sum of Digits is: "+s);
    }
    
}