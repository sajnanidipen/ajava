import java.io.*;
import java.sql.*;
public class BlobDemoop{

	public static void main(String args[]){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/imgdemo","root","");
			PreparedStatement  ps=con.prepareStatement("select * from img_tab");
			ResultSet rs=ps.executeQuery();
			String arr[]={"ff.png","ss.jpg","tt.gif"};
			//int i=1;
			int j=0; 
			while(rs.next()){
			Blob b=rs.getBlob(2);
			byte barr[]=b.getBytes(1,(int)b.length());//where 1 is pos
			byte barr[]=b.getBytes(1,(int)b.length());
			
			FileOutputStream fop=new FileOutputStream("C:\\jdbc\\"+arr[j]);
			fop.write(barr);
			j=j+1;
			//i=i+1;
			}
				con.close();
			
		}
		catch(Exception e){
			System.out.println("error in code......");
			System.out.print(e);
		}
			
}

}