package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class RoomAddServlet extends
	GenericServlet 
	{
	public RoomBean rb;
	public ServletContext sct;	
	@Override
	public void init() throws ServletException
	{
		rb=new RoomBean();
		sct=this.getServletContext();
	}
	@Override
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String rowner=req.getParameter("rowner");
		String rmtname=req.getParameter("rmtname");
		String rmtnbr=req.getParameter("rmtnbr");
		String raddr=req.getParameter("raddr");
		Long phno=Long.parseLong(req.getParameter("phno"));
		//String rid=req.getParameter("rid");
		
		

		rb.setRowner(rowner);
		rb.setRmtname(rmtname);
		rb.setRmtnbr(rmtnbr);
		rb.setRaddr(raddr);
		rb.setPhno(phno);
		//rb.setRid(rid);
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<table>");




		pw.println("---RegDetails---<br>");
		pw.println("<tr>");

		
		pw.println("owner name:"+rb.getRowner());
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<br>roommate name:"+rb.getRmtname());
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<br>roommate number:"+rb.getRmtnbr());
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<br>roomaddress:"+rb.getRaddr());
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<br>contact :"+rb.getPhno());
		pw.println("</tr>");
		
		pw.println("<br>");
		pw.println("your registration are valid");
		pw.println("<br>");
		AddRoom rd=new AddRoom();
		
		int k=rd.register(rb);
		if(k>0)
		{
			pw.println("Room registered Successfuly..<br>");
			pw.print("<a href='logout'>LogOut</a>");
			pw.println("<br>");
			pw.println("<a href='AddRoom.html'>Menu</a>");
			
			//RequestDispatcher rds=req.getRequestDispatcher("Login.html");
			//rds.include(req, res);
		}
		
		
		
	}

}
