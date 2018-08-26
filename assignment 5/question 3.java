class PrintFunctions
{
	void Print()
	{
		System.out.println("This print function contains null arguments.");
	}
	void Print(int x)
	{
		System.out.println("This print function contains integer arguments.");
	}
	void Print(float y)
	{
		System.out.println("This print function contains float arguments.");
	}
}
public class OverloadPrint
{
	public static void main(String[] x)
	{
		PrintFunctions obj = new PrintFunctions();
		obj.Print();
		obj.Print(1);
		obj.Print(8.5f);
	}
}