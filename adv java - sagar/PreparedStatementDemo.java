import java.io.*;
import java.util.*;
import java.sql.*;

public class PreparedStatementDemo{
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sycs","root","");
			System.out.println("Success");
			
			PreparedStatement ps = conn.prepareStatement("insert into student values(?, ?)");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID:");
			int id = sc.nextInt();
			System.out.println("Enter Name: ");
			String name = sc.next();
			ps.setInt(1,id);
			ps.setString(2, name);
			ps.execute();
			
			ResultSet res = ps.executeQuery("select * from student");
			while(res.next()){
				
				System.out.print("Rollno:"+res.getInt("rollno")+" ");
				System.out.println("Name:"+res.getString("name"));
			}
			res.close();
			ps.close();
			conn.close();
		}
		
		catch(Exception e){
			System.out.print(e);
		}		
	}
}