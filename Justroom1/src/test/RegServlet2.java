package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class RegServlet2 extends GenericServlet
{
public RegBean rb;
public ServletContext sct;
@Override
public void init() throws ServletException
{
	sct=this.getServletContext();
	rb=(RegBean)sct.getAttribute("beanRef");
	
}
public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
{
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	String addr=req.getParameter("addr");
	Long phno=Long.parseLong(req.getParameter("phno"));
	
	String mId=req.getParameter("mId");
	rb.setAddr(addr);
	rb.setPhno(phno);
	rb.setmId(mId);
	pw.println("your registration are valid");
	pw.print("<a href='dis'>CLICK</a>");
	pw.println("to view registration details");	
}
}
