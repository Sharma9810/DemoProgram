interface Animals
{
    void speak();
    void eat();
}
class Dog implements Animals
{
    public void speak()
    {
        System.out.println("Woof-Woof!");
    }
    public void eat()
    {
        System.out.println("I eat Bone.");
    }
}
class Cat implements Animals
{
    public void speak()
    {
        System.out.println("Meow!");
    }
    public void eat()
    {
        System.out.println("I eat Fish.");
    }
}
public class Interfaces 
{
    public static void main(String[] args)
    {
        Dog ob=new Dog();
        ob.speak();
        ob.eat();
        Cat o=new Cat();
        o.speak();
        o.eat();
    }
}