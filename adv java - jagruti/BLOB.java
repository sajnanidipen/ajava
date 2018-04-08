import java.sql.*;
import java.io.*;
import java.util.*;
class image{
	public static void main(String[]args){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/imgtable1","root","");
		PreparedStatement ps=connection.PreparedStatement("insert into imagtable values(?,?)");
		ps.setString(1,"Roshni");
		ps.setString(2,"Rachana");
		FileInputStream fin=new FileInputStream("C:\Users\user\Desktop\Siddharth.jpg");
		ps.setBinaryStream(2,fin,fin.available());
		ps.execute();
		System.out.println("Records inserted Successfully");
		connection.close();
	}
	catch(Exception e){
		System.out.println("Error!!!")
	}
}
	
}