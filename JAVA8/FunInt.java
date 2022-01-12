package demo;

@FunctionalInterface
interface Eatable
{
	abstract public void eat();
}

class FunInt                               // Annoymous class
{
	public static void main(String args[])
	{
		Eatable e=new Eatable()
		{
			public void eat()
			{
				System.out.println("Nice fruits");
			}
		};
		e.eat();
	}
}