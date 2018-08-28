import java.util.Scanner;
public class Waveform 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,temp;
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
            if(i%2==0)
            {
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        System.out.println("\nWaveform: ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
