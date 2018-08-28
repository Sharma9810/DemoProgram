abstract class Animals
{
    String name,breed,color;
    abstract void eat();
    void speak()
    {
        
    }
    void set()
    {
        
    }
}
class Dog extends Animals
{
    void set()
    {
        name="Jack";
        breed="Labrador";
        color="black";
        System.out.println("My name is "+name+".\nI am a "+breed+" of "+color+" color.");
    }
    public void eat()
    {
        System.out.println("I eat Bone.");
    }
    void speak()
    {
        System.out.println("Woof-Woof!");
    }
}
class Cat extends Animals
{
    void set()
    {
        name="Pearl";
        breed="Persian";
        color="White";
        System.out.println("My name is "+name+".\nI am a "+breed+" of "+color+" color.");
    }
    public void eat()
    {
        System.out.println("I eat Fish.");
    }
    void speak()
    {
        System.out.println("Meow!");
    }
}
public class AbstractMethods 
{
    public static void main(String[] args)
    {
        Dog t=new Dog();
        Cat f=new Cat();
        t.set();
        t.eat();
        t.speak();
        f.set();
        f.eat();
        f.speak();
    }
    
}
