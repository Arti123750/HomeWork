package com.homework.practiseprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertValueInJDBC {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	 static final String DB_URL = "jdbc:mysql://localhost/STUDENT";
	static final String USER="root";
	static final String PASS="root";
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Connection con=null;
		PreparedStatement stmt = null;
		
		 try {
		 Class.forName("com.mysql.jdbc.Driver");
		 System.out.println("Loading Driver.....");

				    //STEP 3: Open a connection
				    System.out.println("Connecting to database.....");
				    con = DriverManager.getConnection(DB_URL,USER,PASS);

		
		String sql="insert into STUDENT_INFO"+" values(?,?,?,?)";
		stmt=con.prepareStatement(sql);
		stmt.setInt(1, 30);
		stmt.setString(2, "Shrawani");
		stmt.setString(3, "UP");
		stmt.setDouble(4, 86.32);
		stmt.execute();
		System.out.println("Inserted data Succesfully");
		
		con.close();
		stmt.close();
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
			 
		 }
		
		 finally
		 {
			 try 
			 {
				 if(con!=null)
				 {
					 con.close();
				 }
			 }
			 catch(Exception e1)
			 {
				 e1.printStackTrace();
			 }
		 }
		 System.out.println("Good bye........!!!");
	}

}
