import java.util.*;
public class ReverseOfArrayUsingRecursion 
{
    static void reverse(int a[],int n)
    {
        if(n>=0)
        {
            System.out.print(a[n]+" ");
            reverse(a,--n);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Reverse of Array: ");
        reverse(a,n-1);
    }
    
}