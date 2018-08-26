abstract class Animal
{
	public void breed()
	{
		System.out.println("Breed.");
	}
	public void colour()
	{
		System.out.println("Colour.");
	}
	abstract void speak();
}
class Dog extends Animal
{
	public void speak()
	{
		System.out.println("Dog barks");
	}
}
class Cat extends Animal
{
	public void speak()
	{
		System.out.println("Cat meows");
	}
}
public class Speak
{
	public static void main(String[] x)
	{
		Dog d = new Dog();
		Cat c = new Cat();
		d.breed();
		d.colour();
		d.speak();
		c.breed();
		c.colour();
		c.speak();
	}
}