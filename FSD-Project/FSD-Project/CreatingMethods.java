package src.com.javaProgram.Assignment;
import java.util.Scanner;
public class CreatingMethods {

	public int additionNumbers(int num1,int num2) {
		int num3=num1+num2;
		return num3;
	}
	

	public static void main(String[] args) {

		CreatingMethods m =new CreatingMethods();
		System.out.println("enter two numbers: ");
		Scanner scan=new Scanner(System.in);
		int ans = 0;
		int num1,num2;
		num1=scan.nextInt();
		num2=scan.nextInt();
		ans=num1+num2;
		System.out.println("Addition is :"+ans);
		
		
		}
	


	


}
