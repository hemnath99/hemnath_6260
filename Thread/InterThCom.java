package self;

import java.util.*;

class PhotoFrame{
	int id;
	String material, size, texture, color;
	public PhotoFrame() {super();}
	public PhotoFrame(int id, String material, String size, String texture,String color) {
		super();
		this.id=id; this.material=material; this.size=size; this.texture=texture; this. color=color;
	}
}
class MaintainPhotoFrames{ 
	Map<String, List<PhotoFrame>> availableFrames=new HashMap<>();
	public boolean isAvailable(String type) {
		synchronized(availableFrames) {
				if(!availableFrames.isEmpty() && availableFrames.containsKey(type)){
					System.out.println(Thread.currentThread() +"Thread 0 : This frame is available in Stack"); return true;
				} else {
				System.out.println(Thread.currentThread() +"Thread 1 : This frame is available in Stack"); return false;
				}
				}
		}
		public void  buyStock(String type) {
			synchronized(availableFrames) {
				if(!availableFrames.isEmpty() && availableFrames.containsKey(type)){
					List <PhotoFrame>photoFrameList=availableFrames.remove(type);
					PhotoFrame photoFrame=photoFrameList.remove(0);
					availableFrames.put(type, photoFrameList);
					System.out.println(Thread.currentThread() +"Thread 2 : PhotoFrame:"+photoFrame.id+" will be delivered to your desired address");
				} else {
				System.out.println(Thread.currentThread() +"Thread 3 : This frame is out of Stack"); 
				}
		}
	}
	public void updateAvailablilityToBuyer(String type) {
		synchronized(availableFrames) {
			while(availableFrames.isEmpty() && !availableFrames.containsKey(type)) {
				try {
					availableFrames.wait();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread()+" Thread 4: Update Buyer : This photo frame is now available in stock ");
		}
	}
	public void updateAvailablityOnUI(String type) {
		synchronized(availableFrames) {
			while(availableFrames.isEmpty() && !availableFrames.containsKey(type)) {
				try {
					System.out.println(Thread.currentThread() +"Thread 5 : This frame is out of Stack"); 
					availableFrames.wait();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread()+" Threa6 : Update UI : This photo frame is now available in stock ");
		}
	}
	public void putStock(PhotoFrame photoFrame) {
		synchronized(availableFrames) {
			String type="c"+photoFrame.color+"-t"+photoFrame.texture;
			if(availableFrames.containsKey(type)){
				List <PhotoFrame>photoFrameList=availableFrames.get(type);
				photoFrameList.add(photoFrame);
				availableFrames.put(type, photoFrameList);
			} else {
				List <PhotoFrame>photoFrameList=new ArrayList<>();
				photoFrameList.add(photoFrame);
				availableFrames.put(type, photoFrameList);
			}
			availableFrames.notifyAll();
			System.out.println(Thread.currentThread()+" Thread 7 : added stock now This photo frame is now available in stock. notifyAll() ");
			
	}
}
}
public class InterThCom {                     //  Main Class 
	public static void main(String[] args) {
		MaintainPhotoFrames main=new MaintainPhotoFrames();
		Thread UIThread=new Thread(new Runnable() {
			public void run() {
				String type="cBrown-tCrack";
				main.updateAvailablityOnUI(type);
			}},"UIThread");
		
		UIThread.start();
	}
}
