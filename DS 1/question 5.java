import java.util.*;
public class ReverseOfArray
{
    public static void reverse(int[]a,int n)
    {
        int temp,j=n-1;
        for(int i=0;i<n/2;i++)
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            --j;
        }
        System.out.println("\nReversed Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
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
        reverse(a,n);
    }
    
}