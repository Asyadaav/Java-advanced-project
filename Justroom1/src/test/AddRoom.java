package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddRoom {

	public int k;
	public int register(RoomBean rb)
	{
		try{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into room values(?,?,?,?,?)");
			ps.setString(1, rb.getRowner());
			ps.setString(2, rb.getRmtname() );
			ps.setString(3, rb. getRmtnbr() );
			ps.setString(4, rb.getRaddr());
			ps.setLong(5, rb.getPhno());
		
			
			k=ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}return k;
	}

}
