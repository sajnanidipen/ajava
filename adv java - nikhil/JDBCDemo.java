import java.io.*;
import java.util.*;
import java.sql.*;

class JDBCDemo{
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/root","root","");
			System.out.println("Success");
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}
}