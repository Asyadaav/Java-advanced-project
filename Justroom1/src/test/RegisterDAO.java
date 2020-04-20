package test;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.*;
@SuppressWarnings("unused")
public class RegisterDAO 
{
public int k;
public int register(RegBean rb)
{
	try{
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement("insert into UserReg2 values(?,?,?,?,?,?,?)");
		ps.setString(1, rb.getuName());
		ps.setString(2, rb.getpWord());
		ps.setString(3, rb.getfName());
		ps.setString(4, rb.getlName());
		ps.setString(5, rb.getAddr());
		ps.setLong(6, rb.getPhno());
		ps.setString(7, rb.getmId());
		
		k=ps.executeUpdate();
	}
	catch(Exception e){
		e.printStackTrace();
		
	}return k;
}

}
