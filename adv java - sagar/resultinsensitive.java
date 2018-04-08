import java.io.*;
import java.util.*;
import java.sql.*;
class resultinsensitive{
	public static void main(String []args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sycs","root","root");
			System.out.println("Success");
			Statement st=conn.createStatement();
			ResultSet res = st.executeQuery("select * from student");
			res.last();
			while(res.previous()){
				
				System.out.print("Rollno:"+res.getInt("rollno")+" ");
				System.out.println("Name:"+res.getString("name"));
				
			}
			res.close();
			st.close();
			conn.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}