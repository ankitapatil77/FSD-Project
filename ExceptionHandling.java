package src.com.javaProgram.Assignment;

import java.util.Scanner;


class UserAgeExceededException extends Exception{
	public UserAgeExceededException(String message) {
		super(message);
	}

public class ExceptionHandling {
	public static void main(String[] args) throws UserAgeExceededException {
		System.out.println("Enter user name and age");
		Scanner scan=new Scanner(System.in);
		String userName=scan.next();
		int userAge=scan.nextInt();
		if(userAge<18) {
			throw new UserAgeExceededException("Sorry you are to younger to registered yet!!!");
			
		}
		else {
			System.out.println("welcom "+ userName+" you are now registered...");
			
		}
	}

}
}
	