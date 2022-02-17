package com.javaProgram;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginLogoutPage extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		Set the content type
		response.setContentType("text/html");
		
//		Get the writer
		PrintWriter out = response.getWriter();
		
//		Get the userName from the request
		String userName = request.getParameter("userName");
		String Password = request.getParameter("Password");
		
		 userName = "Admin";
	     Password = "Admin123";

		
//		Validate the username and password
		if(userName.equals(userName) && Password.equals(Password)) {
//				Redirect to the Dashboard
			
            out.println("You have LoggedIn");
            out.println("Page Name : myAppp.com");
            out.println("Page developed by Ankita Patil...");
            out.println("<p><h4><a href='LogoutPage'>LOGOUT</a></h4>");
			}

		else {
			out.println("<h1><font color='Blue'>Invalid username or password...</font></h1>");
			response.sendRedirect("index.html");
            
		}
	}

}
