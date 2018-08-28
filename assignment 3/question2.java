import java.util.Scanner;
public class LeapYear 
{
    public static void main(String[] args)
    {
        int yr,flag;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year: ");
        yr=sc.nextInt();
        if(yr%4==0)
        {
            if(yr%100==0)
            {
                if(yr%400==0)
                {
                    flag=1;
                }
                else
                {
                    flag=0;
                }
            }
            else
            {
                flag=1;
            }
        }
        else
        {
            flag=0;
        }
        if(flag==1)
        {
            System.out.println(yr+" is a leap year.");
        }
        else
        {
            System.out.println(yr+" is not a leap year.");
        }
    }
    
}