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
public class MergeLinkedList 
{
    public static Node insert(Node head,int num)
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
        return head;
    }
    public static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static Node sort(Node head)
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
        return head;
    }
    public static Node merge(Node head1,Node head2)
    {
        Node temp=head1;
        Node ptr=head2;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=ptr;
        return head1;
    }
    public static void main(String[] args) 
    {
        Node head1=null;
        Node head2=null;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of 1st List: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of 1st List:");
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            head1=insert(head1,num);
        }
        System.out.print("Enter the size of 2nd List: ");
        int m=sc.nextInt();
        System.out.println("Enter the elements of 2nd List:");
        for(int i=0;i<m;i++)
        {
            int num=sc.nextInt();
            head2=insert(head2,num);
        }
        System.out.print("List 1: ");
        head1=sort(head1);
        display(head1);
        System.out.print("\nList 2: ");
        head2=sort(head2);
        display(head2);
        head1=merge(head1,head2);
        System.out.println("\nMerged LinkedList:");
        head1=sort(head1);
        display(head1);
    }
}