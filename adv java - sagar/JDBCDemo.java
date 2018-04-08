import java.io.*;
import java.util.*;
import java.sql.*;
class JDBCDemo{
	public static void main(String []args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/","root","");
			System.out.println("Success");
			Statement st = conn.createStatement();
			String s = "create database fycs";
			st.execute(s);
			String s1 = "use fycs";
			
			st.execute(s1);
			String s2 = "create table student(rollno int(10),name varchar(10))";
			st.execute(s2);
			String s3="insert into student values(1,'Ashwini')";
			st.execute(s3);
			String s4="insert into student values(3,'Sumit')";
			st.execute(s4);
			String s5 = "insert into student values(4,'Sagar')";
			st.execute(s5);
			
			conn.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}