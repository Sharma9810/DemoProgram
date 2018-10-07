import java.util.*;
public class FindNumberUsingRecursion 
{
    static boolean find(int a[],int num,int n)
    {
        if(n==-1)
        {
            return false;
        }
        else if(a[n]==num)
        {
            return true;
        }
        else
        {
            return find(a,num,--n);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array: " );
        int n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the number to find: ");
        int num=sc.nextInt();
        boolean result=find(a,num,n-1);
        if(result)
        {
            System.out.println("Element Present in the Array: "+result);
        }
        else
        {
            System.out.println("Element Present in the Array: "+result);
        }
    }
    
}