package com.javaProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class ValidationOfEmail {
	public static void main(String[] args) {
		ArrayList<String> emails = new ArrayList<String>();  

        
        
        emails.add("java@domain.com"); 
 
        
        emails.add("xyz#@domain.co.in");  
        
        
        emails.add("javaProject@domain.com"); 
        
        	System.out.println( emails +" are valid email");
        


	       
	       System.out.println("Enter any email address to check");
	       Scanner sc = new Scanner(System.in);
	       String input = sc.nextLine();
	       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
         
        }  
    

	public static boolean isValidEmail(String emails) {
		   String regex = "(.+)@(.+)";
			 //initialize the Pattern object
		       Pattern pattern = Pattern.compile(regex);
		       Matcher matcher = pattern.matcher(emails);
		       return matcher.matches();
	}

	}


		
	


