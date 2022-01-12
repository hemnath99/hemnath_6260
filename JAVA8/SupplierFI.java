package demo;

import java.util.Random;
import java.util.function.*;

class SupplierFI{
	public static void main(String[]args) {
		//Sample1  //
	Supplier<Double> getRandomDouble=()->Math.random();
	System.out.println(getRandomDouble.get());
	
	//  Sample 2  //
	Supplier<String>supplier=()->"Hemnath";
    System.out.println(supplier.get());	
    
    //  Sample 3  //
    Random random=new Random();
    Supplier<Integer> getRandom=()->random.nextInt();
	System.out.println(getRandom.get());
 }
}