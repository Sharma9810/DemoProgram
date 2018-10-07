import java.util.*;
public class FrequencyOfString 
{
    static char find_frequency(String str)
    {
        char c=' ';
        int count[] = new int[256];
        int len = str.length();
        for (int i=0; i<len; i++)
        {
            count[str.charAt(i)]++;
        }
        int max = -1; 
        for (int i = 0; i < len; i++) 
        {
            if (max < count[str.charAt(i)]) 
            {
                max = count[str.charAt(i)];
                c = str.charAt(i);
            }
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        char c=find_frequency(str);
        System.out.println("The Character that has the maximum frequency is: "+c);
    }
}