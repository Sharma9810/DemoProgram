import java.util.*;
public class PallindromeOfString 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.next();
        String rev="";
        int len=str.length();
        for ( int i = len - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
        if(str.equals(rev))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        System.out.println("Output: "+rev);
    }
      
}