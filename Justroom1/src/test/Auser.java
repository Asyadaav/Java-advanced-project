package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Auser extends  HttpServlet{
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		Connection con;
		res.setContentType("text/html");
		// TODO Auto-generated method stub
		
		try{

		con=DBConnection.getCon();
		
			PreparedStatement ps2=con.prepareStatement("select * from userreg2 ");
	
		pw.println("<h1>USERS</h1><br>");
		pw.println("<br>");
		
		
			
			pw.println("<table width='80%' border='1'>");
			pw.println("<tr>");
			pw.println("<th width='24%'>UNAME</th>");
			pw.println("<th width='28%'>PWORD</th>");
			pw.println("<th width='20%'>no of mates</th>");
			pw.println("<th width='20%'>FNAME</th>");
			pw.println("<th width='20%'>ADDR</th>");
			pw.println("<th width='20%'>PHNO</th>");
			pw.println("<th width='20%'>MID</th>");

			
			pw.println("</tr>");
			ResultSet rs=ps2.executeQuery();
			while(rs.next())
			{
				
				pw.println("<tr>");
				pw.println("<td>"+rs.getString(1)+"</td>");
				pw.println("<td>"+rs.getString(2)+"</td>");
				pw.println("<td>"+rs.getString(3)+"</td>");
				pw.println("<td>"+rs.getString(4)+"</td>");
				pw.println("<td>"+rs.getString(5)+"</td>");
				pw.println("<td>"+rs.getString(6)+"</td>");
				pw.println("<td>"+rs.getString(7)+"</td>");

				

				pw.println("</tr>");
			}
				
			
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("</table>");
	}

}

