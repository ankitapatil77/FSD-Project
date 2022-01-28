package com.javaProgram.hibernate.hibernateAnnotation;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.transaction.*;
import javax.xml.bind.*;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.javaProgram.hibernate.hibernateAnnotation.productdetails;
import com.javaProgram.hibernate.HibarnetUtil;
/**
 * Servlet implementation class LidtProduct
 */
public class LidtProduct extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
               SessionFactory factory = HibarnetUtil.getSessionFactory();
               
               Session session = factory.openSession();
               // using HQL
               List<productdetails> list = session.createQuery("from EProduct").list();
               
               session.close();
               
                PrintWriter out = response.getWriter();
                out.println("<html><body>");
                out.println("<b>Product Listing</b><br>");
                for(productdetails p: list) {
                        out.println("ProductId: " + String.valueOf(p.getID()) + ", ProductName: " + p.getName() +
                                        ", ProductPrice: " + String.valueOf(p.getPrice()) + ", Date Added: " + p.getDateAdded().toString() + "<br>");
                }
                
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
