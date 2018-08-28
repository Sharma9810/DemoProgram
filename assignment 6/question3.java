import java.util.Scanner;
public class ParseInt 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        String a,b;
        a=s.next();
        b=s.next();
        int x,y;
        x=Integer.parseInt(a);
        y=Integer.parseInt(b);
        if(x>y)
        {
            System.out.println(x+" is greater than "+y);
        }
        else
        {
            System.out.println(y+" is greater than "+x);
        }
    }
    
}
