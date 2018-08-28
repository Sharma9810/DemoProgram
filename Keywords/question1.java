class Parent
{
    public void display()
    {
        System.out.println("This is Base Class.");
    }
}
class Child extends Parent
{
    public void Show()
    {
        System.out.println("This is Derived Class.");
    }
    public void call()
    {
        display();
    }
}
public class Assignment6Q1 
{
    public static void main(String[] args)
    {
        Child o=new Child();
        o.Show();
        o.call();
    }
    
}