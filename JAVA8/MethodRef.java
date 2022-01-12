package demo;

interface Eng
{
	abstract public void speed();
}
class Car
{
	public static void average()
	{
		System.out.println("The averge of the car is very Good");
	}
	public void wheel()
	{
	System.out.println("Car has wheels of MRF company");
	}
//	public Car()                                         
//	{
//	System.out.println("This is constructor of Car");
//	}
}
class MethodRef
{
	public static void main(String[] args)
	{
		// Using Lamda epression
		Eng obj = ()->System.out.println("Speed is Good");
		obj.speed();
		
		// Lamda replaced with static method Reference
		Eng obj1= Car :: average;
		obj1.speed();

		// Lamda replaced with instance method Reference
		Car car = new Car();
		Eng obj2=car :: wheel;
		obj2.speed();
		
		// Lamda replaced with constructor method Reference
//      Car car = new Car();
//		Eng obj3=Car :: new;                  // constructor name should same as class name  //
//		obj3.speed();
	}
}
