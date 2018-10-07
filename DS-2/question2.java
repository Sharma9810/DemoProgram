import java.util.*;
public class ToggleString 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.next();
        char[] charArray = str.toCharArray();
        for(int i=0; i < charArray.length; i++)
        {
            if( Character.isUpperCase(charArray[i]) )
            {
                charArray[i] = Character.toLowerCase( charArray[i] );
                
            }
            else if(Character.isLowerCase(charArray[i]) )
            {
               charArray[i] = Character.toUpperCase( charArray[i] );
            }    
            
        }
        str=new String(charArray);
        System.out.println(str);
    }
}