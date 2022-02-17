package src.com.javaProgram.Assignment;




class Outer{
	private long someVar;
	int val;
	public class Inner{
		int val;
		void in() {
			int val = 10;
			System.out.println("someVar : " + someVar);//Accessible here
			System.out.println("Inside Inner's in...");
			System.out.println("Local val : " + val);
			System.out.println("Instance val : " + this.val);
			System.out.println("Outer's Instance val : " + Outer.this.val);
			
			
		}
	}
	
	void met() {
		Inner ref = new Inner();
		ref.in();
	}

	

	
}

public class InnerClass {
	public static void main(String[] args) {
		//new Outer().Inner().in();
		new Outer().met();
		
	}
}


