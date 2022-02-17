package src.com.javaProgram.Assignment;

public class ExecutionOfSleep {
	private static final Object LOCK = new Object();

	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
        synchronized (LOCK) 
        {
            try {
				((Thread) LOCK).sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 1 second");
        }

	}

}
