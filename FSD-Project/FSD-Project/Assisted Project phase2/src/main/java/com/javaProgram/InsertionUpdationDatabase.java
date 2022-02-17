package com.javaProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertionUpdationDatabase {
	
	public static final String URLTOCONNECT = "jdbc:mysql://localhost:3306/product";


    public static final String USERNAME = "root";


    public static final String PASSWORD = "";
    static String qry;
    static Statement statement;
    private static Connection dbCon;
    private PreparedStatement preparedstatment;
	private static ResultSet rs;
    public static void main(String[] args) throws SQLException {
   	 
    	InsertionUpdationDatabase menu = new InsertionUpdationDatabase();
    	

       try {
//            1. Load the Driver
            Class.forName("com.mysql.jdbc.Driver");

//            2. Try to establish the connection to database
            
             dbCon = DriverManager.getConnection(URLTOCONNECT, USERNAME, PASSWORD);
            System.out.println("Successfully connected to the database now ...");
            
            System.out.println("*************Welcome To Ecommerce Application***************");
            System.out.println();
            
            System.out.println("*************We are Finding Product Details Using Product Id**********");
            System.out.println();


       Scanner scan=new Scanner(System.in);
       System.out.println("enter product id,name,price: ");
       int ProductId=scan.nextInt();
       String ProductName=scan.next();
       int ProductPrice=scan.nextInt();
	   new InsertionUpdationDatabase().addNewProduct(dbCon, ProductId, ProductName, ProductPrice);
       

       System.out.println("Enter id of product which you want to update ");
        ProductId=scan.nextInt();
        ProductName=scan.next();
       ProductPrice=scan.nextInt();
	   new InsertionUpdationDatabase().updateProductsDetailsById(dbCon, ProductId);
       
       
      
       
  }catch (ClassNotFoundException|SQLException e) {
	System.out.println("some isuee..."+e.getMessage());
}
       
}

	private void addNewProduct(Connection dbCon, int ProductId, String ProductName, int ProductPrice) {
		qry = " insert into productdetails values(?,?,?)";
		try {
			preparedstatment=dbCon.prepareStatement(qry);
			//replace the placeholders with actual values
			preparedstatment.setInt(1,ProductId);
			preparedstatment.setString(2,ProductName);
			preparedstatment.setInt(3,ProductPrice);
			
			ResultSet rs= preparedstatment.executeQuery();
			
			//execute query
			if(preparedstatment.executeUpdate()>0) {
				System.out.println("new product added...");
			}
			
		}catch(SQLException e) {
			System.out.println("some issue while adding product details..."+e.getMessage());
		}
		
	}
	private void updateProductsDetailsById(Connection dbCon, int ProductId) {
		qry="select * from productdetails where ProductId=?";
		
		try {
			
			preparedstatment= dbCon.prepareStatement(qry);
			preparedstatment.setInt(1, ProductId);
			 
			
			if(preparedstatment.executeUpdate()>0) {
				System.out.println("ProductId: "+rs.getInt("ProductId")+", ProductName: "+rs.getString("ProductName")+",ProductPrice: "+rs.getString("ProductPrice"));
				
			}
			dbCon.close();
		} catch (SQLException e) {
			System.out.println("isuue occur while displaying product details: "+e.getMessage());
		}
    
	}	
}