package self;

public class DigitSum {

	public static void main(String[] args) {
		int n=5656;
		int sum=0;
		while(n>0) {
			int mod=n%10;  // gives remainder of n //
			sum+=mod;      // add and store in sum // 0+6=6 // 6+5 =11 // 11+6=17 //  17+5=22 //
			n=n/10;            // to remove last digit //  565 // 56 // 5 // 0
		}
		System.out.println(""+sum);
	}

}
