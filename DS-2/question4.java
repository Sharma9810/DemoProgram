import java.util.Scanner;
import java.lang.*;
public class SubsequenceOfString
{
    static void sub(String str)
    {
        int len=str.length();
	for(int i=0;i<len;i++)
	{
	    for(int j=i+1;j<=len;j++)
	    {
		System.out.print("{"+str.substring(i,j)+"}  ");
	    }
	}
    }
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
	String str= sc.nextLine();
	System.out.println("Entered String: " + str);
        sub(str);
	System.out.println();
    }
}