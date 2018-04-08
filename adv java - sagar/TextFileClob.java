import java.io.*;
import java.util.*;
import java.sql.*;

public class TextFileClob{
	public static void main(String []args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sycs?useSSL=true", "root", "");
			System.out.println("Connected");
		
			PreparedStatement ps = con.prepareStatement("insert into txtfile values(?, ?)");
		
			ps.setInt(1, 5);
			
			//Get text file and store in DB
			File f = new File("E:/sample.txt");
			FileReader fr = new FileReader(f);
			ps.setCharacterStream(2,fr,(int)f.length()); //2 = 2nd ?
			ps.executeUpdate();
			
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}