import java.io.*;
import java.util.*;
import java.sql.*;

class ImgRetrieve{
	public static void main(String []args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sycs", "root", "");
			System.out.println("Connected");
		
			PreparedStatement ps = con.prepareStatement("select * from image");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Blob b = rs.getBlob(2);//2nd column data
				byte barr[] = b.getBytes(1, (int)b.length());
				FileOutputStream fout = new FileOutputStream("E:/Triggerchange1.png");
				fout.write(barr);
				fout.close();
			}
			System.out.println("Done!");
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}