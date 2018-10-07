import java.util.*;
public class BubbleSort 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int temp;
        System.out.print("Enter Size of Array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Entered Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("\nSorted Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}