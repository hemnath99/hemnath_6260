
package demo;

class A extends Thread{
	public void run() {
		System.out.println("Thread A Starts");
		for(int i=0; i<5;i++) {
			System.out.println("Thread A "+i);
		}
		}
}
class B extends Thread{
	public void run() {
		System.out.println("Thread B Starts");
		for(int i=0; i<5;i++) {
			System.out.println("Thread B "+i);
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		A t1=new A();
		B t2=new B();

         t1.start(); 
         t1.suspend();        
         t2.start(); 
         t1.resume();
       
	}

}
