import java.util.Scanner;
class reverseNumber
{
public static void main(String args[])
{
Scanner k=new Scanner(System.in);
int n;
System.out.println("Enter no:");
n=k.nextInt();
int r,i=0;
int t=0;
while(n!=0)
{
r=n%10;
t=r+t*10;
i++;
n=n/10;
}
System.out.println("Reverse: "+t);
}
}