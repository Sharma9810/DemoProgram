import java.util.Scanner;
public class LeapYear 
{
    public static void main(String[] args)
    {
        int first,second,third;
        Scanner f=new Scanner(System.in);
        System.out.print("Enter first number: ");
        first=f.nextInt();
 Scanner s=new Scanner(System.in);
        System.out.print("Enter second number: ");
        second=s.nextInt();
 Scanner t=new Scanner(System.in);
        System.out.print("Enter third number: ");
        third=t.nextInt();
        if(first>second && first > third)
        {
 System.out.print(first +"is the largest number");
}
            else if(second>first && second>third)
            {
 System.out.print(second +"is the largest number");
               
            }
            else
            {
                 System.out.print(third +"is the largest number");
            }
       
    }
    
}