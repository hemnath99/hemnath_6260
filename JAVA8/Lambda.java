package demo;

@FunctionalInterface
interface Square
{
	int calculate(int x);
}
class Lambda
{
	public static void main(String args[])
	{
		Square s = (int x) -> x*x;                          // lambda expression to define the calculate method
		int ans = s.calculate(5);
		System.out.println(ans);
	}
}