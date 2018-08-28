class Const
{
    Const()
    {
        System.out.println("Default Constructor.");
    }
    Const(int x)
    {
        this();
    }
}
public class Assignment6Q2 
{
    public static void main(String[] args)
    {
        Const o=new Const(5);
        
    }
    
}
