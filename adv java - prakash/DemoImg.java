import java.io.*;
import java.sql.*;
class DemoImg{
	public void static main(String []args){
		Connection conn=DriverManager("jdbc:mysql:\\localhost\\imgdemo","root,","");
		PreparedStatement ps=new conn.prepareStatement("insert into table img(?,?)");
		ps.setInt(1,1);
		FileInputStream fin=new FileInputStream("C:\\jdbc\\abc.gif");
		ps.setBinaryStream(2,fin,fin.avaliable());
		ps.close();	
	}
}