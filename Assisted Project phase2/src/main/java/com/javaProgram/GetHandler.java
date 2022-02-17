package com.javaProgram;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetHandler
 */
public class GetHandler extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		System.out.println("inside doGet() ");
		
		
		

		
		//get a reference to printWriter
		PrintWriter out=response.getWriter();
		
		//lets write something
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>we are running servelet now on the server..</h2>");
		out.println("<h1> Hello World "
				+ "Welcome to javaProgram...."+"</h1>");
		out.println("<h3> Servlet running at: "+request.getContextPath()+"<h3>");
		out.println("<h4>"+request.getServletPath()+"</h4>");
		out.println("<body>");
		out.println("<html>");
	}
}



