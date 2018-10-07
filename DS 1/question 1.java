import java.util.*;
public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int a1[]=new int [n];
        int a2[]=new int [n];
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter elements of first array:");
        for(int i=0;i<n;i++)
        {
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of second array:");
        for(int i=0;i<n;i++)
        {
            a2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a1[i]==a2[j])
                {
                    list.add(a2[j]);
                    a2[j]=0;
                    break;
                }
            }
        }
        Collections.sort(list);
        System.out.println("Common Elements:"+list);
        
    }
}