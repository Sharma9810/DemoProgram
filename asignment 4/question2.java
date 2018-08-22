import java.util.Scanner;
class evenNumbers
{
public static void main(String args[])
{
Scanner x=new Scanner(System.in);
System.out.print("Enter your no:");
int n;
n=x.nextInt();
System.out.println("Even numbers are: ");
for(int i=1;i<=n;i++)
{
if(i%2==0)
{
System.out.print(i+" ");
}
}
}
}