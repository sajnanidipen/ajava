import java.io.*;
import java.sql.*;
public class ClobDemo{

	public static void main(String args[]){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/imgdemo","root","");
			PreparedStatement  ps=con.prepareStatement("INSERT INTO  clob_demo1 values(?,?)");
			File f=new File("C:\\jdbc\\demo.txt");
			
			FileReader fr=new FileReader(f);
			ps.setInt(1,1);
			ps.setCharacterStream(2,fr,(int)f.length());
			ps.execute();
			System.out.println("inserted");
			con.close();
			
			}
		catch(Exception e){
			System.out.println("Error in Code....");
			System.out.println(e);
			
		}
	}
}