import java.util.*;
public class CompareTwoSets 
{
    public static void compare_sets(Set s1,Set s2)
    {
        Set<Integer> s3=new HashSet();
        s3.addAll(s1);
        s3.retainAll(s2);
        System.out.println("\nCommon Elements: "+s3);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        System.out.println("Enter the size of the sets: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("Enter the elements for 1st Set:");
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            s1.add(num);
        }
        System.out.println("Enter the elements for 2nd Set:");
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            s2.add(num);
        }
        Iterator i1=s1.iterator();
        Iterator i2=s2.iterator();
        System.out.println("Entered Set 1:");
        while(i1.hasNext())
        {
            System.out.print(i1.next()+" ");
        }
        System.out.println("\nEntered Set 2:");
        while(i2.hasNext())
        {
            System.out.print(i2.next()+" ");
        }
        compare_sets(s1,s2);
    }
    
}