import java.io.*;
import java.util.*;
import java.sql.*;

class imgfile{
	public static void main(String []args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sycs", "root", "");
			System.out.println("Connected");
		
			PreparedStatement ps = con.prepareStatement("insert into image values(?, ?)");
			ps.execute();
		
			ps.setInt(1, 15);
			
			//Get image file and store in DB
			FileInputStream fs = new FileInputStream("C:/Trigger.png");
			ps.setBinaryStream(2, fs, fs.available()); //2 = 2nd ?
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}