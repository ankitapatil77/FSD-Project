package com.javaProgram;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JDBCConnectionsStatementsandResultSets
 */
public class JDBCConnectionsStatementsandResultSets extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
     
           
           ConnectWithJDBC dbCon = new ConnectWithJDBC("URLTOCONNECT","USERNAME","PASSWORD");
           
           Statement stmt = ((Statement) dbCon).getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
           
           stmt.executeUpdate("insert into eproduct (ProductId, ProductName, ProductPrice) values ('2330','New Product', 17800.00, now())");
           
           ResultSet rst = stmt.executeQuery("select * from productdetails");
           
           while (rst.next()) {
                   out.println(rst.getInt("ProductId") + ", " + rst.getString("ProductName") + ", "+rst.getInt("ProductPrice")+" <Br>");
           }
           
           stmt.close();
           
           
           
           out.println("</body></html>");
           dbCon.closeConnection();
           
   
   } catch (SQLException e) {
           e.printStackTrace();
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
