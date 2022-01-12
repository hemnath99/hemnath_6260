package demo;

interface Test{
	public void square(int a);               // abstract method
	default void show()                        // default method
		{
			System.out.println("Default Method Executed");
		}
	public static void display()           // Static method
	{
		System.out.println("This is java 8 static method ");
	}
}
class DefaultMethod implements Test
{
              // implementation of square abstract method
	public void square(int a)
	{
		System.out.println(a*a);
	}
public static void main(String args[]) 
{
	DefaultMethod d = new DefaultMethod();
	d.square(4);                                  // default method executed
	d.show();
	Test.display();
}
}
