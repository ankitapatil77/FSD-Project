package src.com.javaProgram.Assignment;

public class TypeCasting {
	public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit Type Casting");
		char ch='Z';
		System.out.println("Value of a: "+ch);
		
		int b=ch;
		System.out.println("Value of b: "+b);
		
		float c=ch;
		System.out.println("Value of c: "+c);
		
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		
		//explicit conversion
		
		double num1=50.5;
		int num2=(int)num1;
		System.out.println("Value of x: "+num1);
		System.out.println("Value of y: "+num2);
		
	}


}
