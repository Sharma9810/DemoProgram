abstract class Vehicle
{
	public void stop()
	{
		System.out.println("STOP!");
	}
	abstract void start();
}
class Twowheeler extends Vehicle
{
	public void start()
	{
		System.out.println("Twowheeler starts");
	}
}
class Fourwheeler extends Vehicle
{
	public void start()
	{
		System.out.println("Fourwheeler starts");
	}
}
public class VehicleQs
{
	public static void main(String[] x)
	{
		Twowheeler t = new Twowheeler();
		Fourwheeler f = new Fourwheeler();
		
		t.start();
		t.stop();
		f.start();
		f.stop();
		
	}
}