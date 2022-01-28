package com.javaProgram.hibernet.log4j.LazyHibernet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.javaProgram.hibernate.HibarnetUtil;
/**
 * Servlet implementation class Log4jServlet
 */
public class Log4jServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");

            SessionFactory factory = HibarnetUtil.getSessionFactory();
                   
            Session session = factory.openSession();
            out.println("Hibernate Session opened.<br>");
            session.close();
            out.println("Hibernate Session closed.<br>");
                   
            out.println("</body></html>");
               
                
            } catch (Exception ex) {
                    throw ex;
            }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
