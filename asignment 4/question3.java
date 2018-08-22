import java.util.Scanner;
class primeNumbers
{
public static void main(String args[])
{
Scanner x=new Scanner(System.in);
System.out.print("Enter no:");
int n,flag=0;
n=x.nextInt();
System.out.println("output: ");
for(int i=1;i<=n;i++)
{
flag=0;
for(int j=2;j<=i/2;j++)
{
if(i%j==0)
{
flag=1;
break;
}
}
if(flag==0)
{
System.out.print(i+" ");
}
}
}
}
