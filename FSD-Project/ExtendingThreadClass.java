package src.com.javaProgram.Assignment;

public class ExtendingThreadClass extends Thread {
	public static void main(String[] args) {

		ExtendingThreadClass  theThread = new ExtendingThreadClass ();//POJO
		
		theThread.start(); //indirectly calls run()
		
		System.out.println(Thread.currentThread().getName() + " running...");
}

@Override
public void run() {
	System.out.println(Thread.currentThread().getName() + " running...");
}


}
