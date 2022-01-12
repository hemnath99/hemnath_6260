package demo;

import java.util.function.*;

public class ConsumerFI {
	public static void main(String[]args) {
	
		// accept //
	Consumer<String> con = s -> System.out.println(s);
	con.accept("Hi !");
	  //  andThen  //
	Consumer<String> con1 = s -> System.out.println(s.toUpperCase());
	Consumer<String> con2 = s -> System.out.println("(" + s + ")");
	con1.andThen(con2).accept("Hello World");
	}
}
