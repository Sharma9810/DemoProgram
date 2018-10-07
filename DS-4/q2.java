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
public class LinkedListRemoveDuplicates 
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
    public static void sort()
    {
        int temp1;
        Node t=head;
        while(t.next!=null)
        { 
            Node temp=head;
            while(temp.next!=null)
            {
               Node ptr=temp.next;
               if(temp.data>ptr.data)
               {
                   temp1=temp.data;
                   temp.data=ptr.data;
                   ptr.data=temp1;
               }
               temp=temp.next;
            }
            t=t.next;
        }
    }
    public static void remove_duplicates()
    {
        Node t=head;
        while(t.next!=null)
        {  
            Node temp=head;
            while(temp.next!=null)
            {
                Node ptr=temp.next;
                if(temp.data==ptr.data)
                {
                   temp.next=ptr.next;
                }
                temp=temp.next;
            }
            t=t.next;
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
        System.out.println("Sorted List:");
        sort();
        display();
        System.out.println("List After Removing Duplicates: ");
        remove_duplicates();
        display();
    }
}