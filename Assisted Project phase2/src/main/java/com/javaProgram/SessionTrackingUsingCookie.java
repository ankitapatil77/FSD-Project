package com.javaProgram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SessionTrackingUsingCookie
 */
public class SessionTrackingUsingCookie extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{  
			  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String n=request.getParameter("userName");  
		    out.print("Welcome "+n);  
		  
		    Cookie ck=new Cookie("uname",n);//creating cookie object  
		    response.addCookie(ck);//adding cookie in the response  
		  
		     
		          
		    out.close();  
		  
		        }catch(Exception e){System.out.println(e);}  
		  }  
	}


