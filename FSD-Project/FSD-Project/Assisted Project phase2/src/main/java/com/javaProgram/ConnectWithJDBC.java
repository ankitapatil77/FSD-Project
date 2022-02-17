package com.javaProgram;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectWithJDBC {
	public static final String URLTOCONNECT = "jdbc:mysql://localhost:3306/product";


    public static final String USERNAME = "root";


    public static final String PASSWORD = "";
    static String qry;
    
    private static final String WELCOME_PROMPT ="\n*******   Phase2.com *******";


	
    private Connection dbCon;

    
    public ConnectWithJDBC(String URLTOCONNECT, String USERNAME, String  PASSWORD) {
		// TODO Auto-generated constructor stub

    	System.out.println(WELCOME_PROMPT); 
    	ConnectWithJDBC menu = new ConnectWithJDBC(URLTOCONNECT, USERNAME, PASSWORD);
                
       try {
//            1. Load the Driver
            Class.forName("com.mysql.jdbc.Driver");


//            2. Try to establish the connection to database
            
            Connection dbCon = DriverManager.getConnection(URLTOCONNECT, USERNAME, PASSWORD);
            System.out.println("Successfully connected to the database now ...");

	} catch (ClassNotFoundException| SQLException e){
		System.out.println("some issue while connecting..."+e.getMessage());
	}
    
    }

    public void closeConnection() throws SQLException {
        if (this.dbCon!= null)
                this.dbCon.close();

	}
}

