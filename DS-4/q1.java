import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
    }
}
public class SwapElementsLinkedList 
{
    static Node head;
    public static void insert(int num)
    {
        Node temp=new Node(num);
        if(head==null)
        {
            head=temp;
        }
        else
        {
           Node ptr=head;
           while(ptr.next!=null)
           {
               ptr=ptr.next;
           }
           ptr.next=temp;
        }
    }
    public static void display()
    {
        Node ptr=head;
        while(ptr.next!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.print(ptr.data+"\n");
    }
    public static void swap(int num1,int num2,int n)
    {
        Node element1=head;
        Node element2=head;
        int flag1=0,flag2=0;
        while(element1!=null)
        {
            if(element1.data==num1)
            {
                break;
            }
            else
            {
                flag1++;
                element1=element1.next;
            }
        }
        while(element2!=null)
        {
            if(element2.data==num2)
            {
                break;
            }
            else
            {
                flag2++;
                element2=element2.next;
            }
        }
        if(flag1==n || flag2==n)
        {
            System.out.println("No Such Elements!");
        }
        else
        {
            element1.data=num2;
            element2.data=num1;
            System.out.println("After Swapping:");
            display();
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            insert(num);
        }
        System.out.println("Entered List:");
        display();
        System.out.println("Enter elements to swap: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        swap(num1,num2,n);
    }
}