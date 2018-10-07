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
public class ReverseLinkedList 
{
    Node head;
    public void insert(int num)
    {
        Node temp=new Node(num);
        Node ptr=head;
        if(ptr==null)
        {
            head=temp;
        }
        else
        {
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=temp;
        }
    }
    public void display()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public void reverse_of_linked_list()
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
    }
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        ReverseLinkedList ob=new ReverseLinkedList();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            ob.insert(num);
        }
        System.out.println("Entered List:");
        ob.display();
        ob.reverse_of_linked_list();
        System.out.println("Linked List after reversing: ");
        ob.display();
    }
}