import java.util.Scanner;
class armstrongNumber
{
public static void main(String args[])
{
Scanner k=new Scanner(System.in);
System.out.println("Enter number:");
int n,x,c=0,r;
double s=0;
n=k.nextInt();
x=n;
while(x!=0)
{
c++;
x=x/10;
}
x=n;
while(x!=0)
{
r=x%10;
s=s+Math.pow(r,c);
x=x/10;
}
if(s==n)
{
System.out.println(n+" is armstrong number");
}
else
{
System.out.println(n+" is not armstrong number");
}
}
}
