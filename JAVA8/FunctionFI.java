package demo;

import java.util.function.*;

public class FunctionFI {
	public static void main(String[] args)
	{
		// apply //
		Function<String, Integer> fun = s -> s.length();
		System.out.println(fun.apply("Hello"));
		
		int amount = 3;
		Function<Integer, Integer> sum = i -> i + i; 
		Function<Integer, Integer> sq = i -> i * i; 
		
		System.out.println(sum.apply(amount));
		System.out.println(sq.apply(amount));
	    //  andThen  //  compose  //
		System.out.println(sum.andThen(sq).apply(amount));
		                              // (6)    ->    (9)
		System.out.println(sum.compose(sq).apply(amount)); 
                            		 //  (18) <-   (36)
		}
}
