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
public class PallindromeLinkedList 
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
        Node ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }
    public static Node reverse(Node head)
    {
        Node current=head;
        Node prev=null;
        Node ptr;
        while(current!=null)
        {
          ptr=current.next;
          current.next=prev;
          prev=current;
          current=ptr;
        }
        head=prev;
        return head;
    }
    public static boolean isPallindrome(Node head,int n)
    {
        Node head1=null;
        Node temp=head;
        int flag=0;
        for(int i=0;i<n;i++)
        {
            head1=insert(head1,temp.data);
            temp=temp.next;
        }
        head1=reverse(head1);
        temp=head;
        Node ptr=head1;
        for(int i=0;i<n;i++)
        {
            if(temp.data==ptr.data)
            {
                temp=temp.next;
                ptr=ptr.next;
                continue;
            }
            else
            {
                flag=-1;
                break;
            }
        }
        if(flag==-1)
        {
            return false;
        }
        else 
        {
            return true;
        }
    }
    public static void main(String[] args) 
    {
        Node head=null;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of LinkedList: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            head=insert(head,num);
        }
        System.out.println("Entered List:");
        display(head);
        if(isPallindrome(head,n))
        {
            System.out.println("\nEntered List is Pallindrome.");
        }
        else
        {
            System.out.println("\nEntered List is not Pallindrome.");
        }
    }
}