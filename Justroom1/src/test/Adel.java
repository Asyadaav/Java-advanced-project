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

public class Adel extends HttpServlet {
	
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		Connection con;
		res.setContentType("text/html");
		// TODO Auto-generated method stub
		String rmtnbr=req.getParameter("rmtnbr");
		String raddr=req.getParameter("raddr");
	
		try{

		con=DBConnection.getCon();
		
			PreparedStatement ps2=con.prepareStatement("delete  from room where rmtnbr=? and raddr=?");
		ps2.setString(1,rmtnbr);
		ps2.setString(2,raddr);
		pw.println("<h1>Results</h1><br>");
		pw.println("<br>");
		
		
			
			pw.println("<table width='80%' border='1'>");
			pw.println("<tr>");
			pw.println("<th width='24%'>Owner</th>");
			pw.println("<th width='28%'>Roommates</th>");
			pw.println("<th width='20%'>no of mates</th>");
			pw.println("<th width='20%'>address</th>");

			pw.println("<th width='20%'>Phno</th>");

			pw.println("</tr>");
			ResultSet rs=ps2.executeQuery();
			while(rs.next())
			{
				
				pw.println("<tr>");
				pw.println("<td>"+rs.getString(1)+"</td>");
				pw.println("<td>"+rs.getString(2)+"</td>");
				pw.println("<td>"+rs.getString(3)+"</td>");
				pw.println("<td>"+rs.getString(4)+"</td>");

				pw.println("<td>"+rs.getLong(5)+"</td>");

				pw.println("</tr>");
			}
				
			
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("</table>");
	}

}
