import java.io.*;
import java.util.*;
import java.sql.*;
class JDBCDEMO1{
	public static void main(String []args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
			System.out.println("Succes");
			Statement st = con.createStatement();
			String create_db = "create database SzY";
			String use_db = "use SzY";
			String create_table = "create table student(roll_no int(10), marks int(10))";
			st.execute(create_db);
			st.execute(use_db);
			st.execute(create_table);
			
			String ins1 = "insert into student values(1,90)";
			String ins2 = "insert into student values(2,85)";
			String ins3 = "insert into student values(3,75)";
			st.execute(ins1);
			st.execute(ins2);
			st.execute(ins3);
			
			ResultSet res = st.executeQuery("Select * from student");
			while(res.next()){
				System.out.println("Student_ID:"+res.getInt(1)+"");
				System.out.println("Student_Marks:"+res.getInt("marks")+"");
			}
			res.close();
			con.close();
		}
		catch(Exception e){
			System.out.println("Error:"+e);
		}
	}
}