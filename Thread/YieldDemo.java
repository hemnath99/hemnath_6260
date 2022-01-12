package demo;

class A1 extends Thread{
	public void run() {
		System.out.println("Thread A Starts");
		for(int i=0; i<5;i++) {
			System.out.println("Thread A "+i);
		}
	}
}
class B2 extends Thread{
	public void run() {
		System.out.println("Thread B Starts");
		for(int i=0; i<5;i++) {
			System.out.println("Thread B "+i);
		}
	}
}
public class YieldDemo {

	public static void main(String[] args) throws InterruptedException {
		A1 t1=new A1();
		B2 t2=new B2();
		t1.start();
		t2.start();
		for(int i=0;i<5;i++) {
		   Thread.yield();
			System.out.println("Main Thread "+i);
		}
	}
}
