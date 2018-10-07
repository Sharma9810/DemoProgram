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
public class LinkedListOddEvenSort 
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
    public static void arrange(Node head)
    {
        Node head1=null;
        Node temp=head;
        int cnt=0;
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        Node ptr=head;
        for(int i=0;i<cnt;i++)
        {
            if(ptr.data%2!=0)
            {
                head1=insert(head1,ptr.data);
            }
            ptr=ptr.next;
        }
        ptr=head;
        for(int i=0;i<cnt;i++)
        {
            if(ptr.data%2==0)
            {
                head1=insert(head1,ptr.data);
            }
            ptr=ptr.next;
        }
        display(head1);
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
        System.out.println("\nArranged List:");
        arrange(head);
    }
    
}