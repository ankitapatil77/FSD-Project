package src.com.javaProgram.Assignment;
import java.util.*;
public class TryCatchBlock {
	public void division() {
		try {
		int num1,num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers: ");
		num1=scan.nextInt();
		num2=scan.nextInt();
		int result=0;
		result=num1/num2;
		System.out.println("division is: "+ result);
	}
		catch(ArithmeticException ae){
			System.out.println("sorry not allowed to divide by 0... ");
		}
			
		}
	public static void main(String[] args) {
		TryCatchBlock tc=new TryCatchBlock();
		tc.division();
	}

}
