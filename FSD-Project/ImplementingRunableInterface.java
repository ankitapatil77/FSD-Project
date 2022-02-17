package src.com.javaProgram.Assignment;

public class ImplementingRunableInterface implements Runnable {
	 public static int myCount = 0;
	    public ImplementingRunableInterface(){
	         
	    }
	    public void run() {
	        while(ImplementingRunableInterface.myCount <= 10){
	            try{
	                System.out.println("Expl Thread: "+(++ImplementingRunableInterface.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex) {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    } 
	    public static void main(String a[]){
	        System.out.println("Starting Main Thread...");
	        ImplementingRunableInterface mrt = new ImplementingRunableInterface();
	        Thread t = new Thread(mrt);
	        t.start();
	        while(ImplementingRunableInterface.myCount <= 10){
	            try{
	                System.out.println("Main Thread: "+(++ImplementingRunableInterface.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	        System.out.println("End of Main Thread...");
	    }
	}


	


