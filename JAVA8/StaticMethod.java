package demo;

interface Engine {
	public static void display()
	{
		System.out.println("This is java 8 static method ");
	}
}
class StaticMethod implements Engine
{
	public static void main(String args[])
	{
		Engine.display();
	}
}