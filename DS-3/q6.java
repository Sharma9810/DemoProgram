import java.util.*;
public class RemoveDuplicateCharactersUsingRecursion 
{
    public static String Remove(String s)
    {
        if ( s.length() <= 1 ) 
        {
            return s;
        }
        if( s.substring(0,s.length()-1).contains(s.substring(s.length()-1,s.length())) ) 
        {
            return Remove(s.substring(0,s.length()-1));
        }
        else 
        {
            return Remove(s.substring(0,s.length()-1)) + s.substring(s.length()-1,s.length());
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        System.out.println("Entered String: "+str);
        System.out.println("String after removing duplicate characters: "+Remove(str));
    }
    
}