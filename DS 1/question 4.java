import java.util.*;
public class ArrayWaveForm 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n=sc.nextInt();
        int a[][]=new int [n][n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Entered 2D Array:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("The Waveform: ");
        int j=0;
        while(j<n)
        {
            for(int i=0;i<n;i++)
            {  
                System.out.print(a[j][i]+" ");
            }
            j++;
            if(j<n)
            {
               for(int i=n-1;i>=0;i--)
               {
                  System.out.print(a[j][i]+" ");
               }
            }
            j++;
        }
    }
    
}