import java.util.*;
import java.sql.*;
import java.io.*;
public class JP{
	public static void main(String args[]){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Peoples?autoReconnect=true&amp;useSSL=false", "root", "");
		
		System.out.print("Mysql connected successfully!");
			
	    con.close();
	}
	catch(Exception ex){
		System.out.print("Exception is: " + ex);
	}
	}
	

}