import java.io.*;
import java.sql.*;
public class BlobDemo{

	public static void main(String args[]){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/imgdemo","root","");
			PreparedStatement  ps=con.prepareStatement("insert into img_tab values( ?,?)");
		
			ps.setInt(1,1);
			FileInputStream  ip=new FileInputStream("C:\\jdbc\\abc.gif");
			ps.setBinaryStream(2,ip,ip.available());
			ps.execute();
			System.out.println("execute ....");
			con.close();
			
		}
		catch(Exception e){
			System.out.println("error in code......");
			System.out.print(e);
		}
			
}

}