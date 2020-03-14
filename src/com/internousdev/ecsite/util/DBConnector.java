package com.internousdev.ecsite.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	private static String driverName="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost/ecsite?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static String user="root";
	private static String password="";

	public Connection getConnection(){
		Connection con=null;

		try{
			Class.forName(driverName);
			con=(Connection) DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}

		return con;
	}
}
