package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

@SuppressWarnings({ "serial", "unused" })
public class Forget extends HttpServlet {
	
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		Connection con;
		res.setContentType("text/html");
		// TODO Auto-generated method stub
		String name=req.getParameter("uName");
		String phno=req.getParameter("phno");
		String pwrd=req.getParameter("pWord");

		
	
		try{

		con=DBConnection.getCon();
		
			PreparedStatement ps2=con.prepareStatement("UPDATE userreg2 SET PWORD = ? WHERE UNAME=? and PHNO=?");
			ps2.setString(1,pwrd);

		ps2.setString(2,name);
		ps2.setString(3,phno);
	
			ResultSet rs=ps2.executeQuery();
			if(rs.next())
			{
				pw.println("your password updated successfully");
				
			}
				
			
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("</table>");
	}

}
