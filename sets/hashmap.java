import java.util.*;
public class HashMapQuestion 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
        System.out.print("Enter the size of the HashMap: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print("Enter key number "+i+": ");
            String key=sc.next();
            System.out.print("Enter value for key number "+i+": ");
            int value=sc.nextInt();
            map.put(key,value);
        }
        System.out.println("Entered HashMap: "+map);
    }
    
}