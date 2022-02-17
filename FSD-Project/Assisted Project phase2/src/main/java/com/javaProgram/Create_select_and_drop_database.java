package com.javaProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Create_select_and_drop_database  {

    	
    	public static final String URLTOCONNECT = "jdbc:mysql://localhost:3306/product";


        public static final String USERNAME = "root";


        public static final String PASSWORD = "";
        static String qry;
        static Statement statement;
        private  Connection dbCon;
        private PreparedStatement preparedstatment;
		
       
        
       
        public static void main(String[] args) throws SQLException {
        	 
        	Create_select_and_drop_database  menu = new Create_select_and_drop_database ();
        	

           try {
//                1. Load the Driver
                Class.forName("com.mysql.jdbc.Driver");

//                2. Try to establish the connection to database
                
                Connection dbCon = DriverManager.getConnection(URLTOCONNECT, USERNAME, PASSWORD);
                System.out.println("Successfully connected to the database now ...");
                
                System.out.println("*************Welcome To Ecommerce Application***************");
	            System.out.println();
	            
	            System.out.println("*************We are Finding Product Details Using Product Id**********");
	            System.out.println();
		        
 
//	            Get a reference to the Statement
	            menu.statement = dbCon.createStatement();

                Scanner scan=new Scanner(System.in);
                System.out.println("enter product id: ");
	            int id=scan.nextInt();
				menu.getProductDetails(dbCon, id);
	            

	            System.out.println("Enter id of product to delete ");
	            
	            int userId = scan.nextInt();
	            
	            scan.nextLine();
	            
	            menu.deleteProductDetails(dbCon, userId);
	            
           }catch (ClassNotFoundException|SQLException e) {
			System.out.println("some isuee..."+e.getMessage());
		}
		}
      
    	
       
     
    public void getProductDetails(Connection dbCon,int id) {
    	
    	qry="SELECT * FROM `productdetails` where ProductId=?";
		
		try {
			preparedstatment = dbCon.prepareStatement(qry);
			preparedstatment.setInt(1, id);
			ResultSet rs= preparedstatment.executeQuery(qry);
			
			if(((PreparedStatement) rs).executeQuery()!=null) {
				System.out.println("ProductName: "+rs.getString("ProductName")+", ProductPrice: "+rs.getString("ProductPrice"));
				
			}
			dbCon.close();
		} catch (SQLException e) {
			System.out.println("isuue occur while displaying product details: "+e.getMessage());
		}
    	
    }
    private void deleteProductDetails(Connection dbCon,int id) {
    	qry="delete from productdetails where ProductId= '"+id+ "'";
    	try {
    	statement=dbCon.createStatement();
    	
		if(statement.executeUpdate(qry)>0)
			
    		System.out.println("product details deleted sucssefully...");
		
    	 }catch(SQLException e) {
    		 System.out.println("issue while deleting product details detail..");
    	 }
    }


    
} 
