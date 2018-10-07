import java.util.*;
public class PowerOfaNumberUsingRecursion 
{
    static int power(int x,int y)
    {
        if(y>0)
        {
            return (x*power(x,--y));
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x & y:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(x+"^"+y+" is: "+power(x,y));
    }
    
}