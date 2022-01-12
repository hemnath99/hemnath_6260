package demo;

class Resource{
	static synchronized void Share() {     //  static 
//	synchronized void Share() {              //  method
	//void Share() {
		//synchronized (this) {                        //  block
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	//	}
	}
}
class T1 extends Thread{
	Resource r;
	T1(Resource r){
	this.r=r;
	}
	public void run() {
		r.Share();
	}
}
class T2 extends Thread{
	Resource r;
	T2(Resource r){
	this.r=r;
	}
	public void run() {
		r.Share();
	}
}
class SyncDemo {

	public static void main(String[] args) {
		Resource R=new Resource();
		T1 a=new T1(R);
		T2 b=new T2(R);
        a.start();
        b.start();
	}
}
