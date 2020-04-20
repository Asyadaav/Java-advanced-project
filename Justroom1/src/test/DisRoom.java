package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class DisRoom  extends GenericServlet
{
public RoomBean rb;
public ServletContext sct;
@Override
public void init() throws ServletException
{
	sct=this.getServletContext();
	rb=(RoomBean)sct.getAttribute("beanRef");
	
}
@Override
public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
{
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	pw.println("<h1>---RegDetails---</h1>");
	pw.println("owner name:"+rb.getRowner());
	pw.println("<br>roommate name:"+rb.getRmtname());
	pw.println("<br>roommate number:"+rb.getRmtnbr());
	pw.println("<br>roomaddress:"+rb.getRaddr());
	pw.println("<br>contact :"+rb.getPhno());
	
	pw.println("<br>");
	pw.println("<form action='final' method='post'>");
	pw.println("<input type='submit' value ='Register'>");
	pw.println("</form>");
}

}
