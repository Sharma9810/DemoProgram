class sort
{
public static void main(String args[])
{
int arr[]={1,1,1,1,0,0,1,0};
int d;
for(int i=1;i<arr.length;i++)
{
for(int j=0;j<arr.length-i;j++)
{
if(arr[j]>arr[j+1])
{
d=arr[j+1];
arr[j+1]=arr[j];
arr[j]=d;
}
}
}
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
}
}