package com.javaProgram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SessionTrackingUsingURLRewrite
 */
public class SessionTrackingUsingURLRewrite extends HttpServlet {


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
        String name = request.getParameter("user");
        String pass = request.getParameter("pass");
        
        if(pass.equals("1234"))
        {
            response.sendRedirect("Dashboard?user_name="+ name);
            
        }
	}

}
