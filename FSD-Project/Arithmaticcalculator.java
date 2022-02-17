package com.javaProgram;

import java.util.Scanner;

public class Arithmaticcalculator {
	public static void main(String[] args) {
		char operator;
	    int num1, num2, result;

	    // create an object of Scanner class
	    Scanner scan = new Scanner(System.in);

	    // ask users to enter operator
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = scan.next().charAt(0);

	    // ask users to enter numbers
	    System.out.println("Enter first number");
	    num1 = scan.nextInt();

	    System.out.println("Enter second number");
	    num2 = scan.nextInt();

	    switch (operator) {

	      // performs addition between two numbers
	      case '+':
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	      // performs subtraction between two numbers
	      case '-':
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	      // performs multiplication between two numbers
	      case '*':
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;

	      // performs division between two numbers
	      case '/':
	        result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    
	}

}
