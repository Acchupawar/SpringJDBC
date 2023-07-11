package com.jdbc.connetion;


public class JDBC {

	public static void main(String[] args) {

		try {
			// load the Driver class 
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "Anand@123";
			

			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
