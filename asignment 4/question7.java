import java.util.Scanner;
class findArray
{
public static void main(String args[])
{
Scanner k=new Scanner(System.in);
System.out.println("Enter no:");
int n=k.nextInt();
int arr[]={1,4,6,7,8,9,10};
int t,flag=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==n)
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.print(n+" found in array");
}
else
{
System.out.print(n+" not found in array");
}
}
}