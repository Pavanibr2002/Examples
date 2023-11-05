package Example;
class Animal2
{
	String color="White";
}
class Dog2 extends Animal2
{
	String color="Black";
	void printcolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class super1 {
	public static void main(String args[])
	{
		Dog2 d=new Dog2();
		d.printcolor();
	}

}
