import java.util.Scanner;
public class SecondLargestNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,max=0,max2=0;
        System.out.print("Enter Size of Array: ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Entered Array: ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]<max && a[i]>max2)
            {
                max2=a[i];
            }
        }
        System.out.println("\nLargest Element: "+max);
        System.out.println("Second Largest Element: "+max2);
    }
    
}