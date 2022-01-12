package demo;

import java.util.function.*;

class PredicateFI {
	public static void main(String[] args)
	{
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Predicate<Integer> even = x -> x % 2 == 0;
		for (int i : num)
		{
			if (even.test(i))
			{
				System.out.println(i);
			}
		}
		// isEqual
		Predicate<String> name = Predicate.isEqual("Mumbai");
		System.out.println(name.test("Mumbai"));
		
		// test 
		Predicate<Integer> greater=(x)->x>10;
		boolean ans=greater.test(25);
		System.out.println(ans);
			
		Predicate<Integer> lesser=(y)->y<2;
		boolean ans2=lesser.test(25);
		System.out.println(ans2);
		
		//  and  //
		boolean ans3=greater.and(lesser).test(15);
		System.out.println("Result of AND : "+ans3);
	
		// or  //
		boolean ans4=greater.or(lesser).test(15);
		System.out.println("Result of OR : "+ans4);
		
		//  negate  //
		boolean ans5=greater.or(lesser).negate().test(5);
		boolean ans6=greater.and(lesser).negate().test(5);
		System.out.println("Negate Or result : " + ans5);
		System.out.println("Negate And result : " + ans6);
			
		// Predicate with String  //
		Predicate<String> strlength=str-> str.length()>5;   
		System.out.println(strlength.test("Hello !"));
		
	}
}
