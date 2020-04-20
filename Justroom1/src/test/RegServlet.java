package test;
import java.io.*;
import java.util.Set;

import javax.servlet.*;

@SuppressWarnings({ "serial", "unused" })
public class RegServlet extends GenericServlet 
{
public RegBean rb;
public ServletContext sct;
@Override
public void init() throws ServletException
{
	rb=new RegBean();
	sct=this.getServletContext();
}
@Override
public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
{
	String uName=req.getParameter("uName");
	String pWord=req.getParameter("pWord");
	String fName=req.getParameter("fName");
	String lName=req.getParameter("lName");
	
	rb.setuName(uName);
	rb.setpWord(pWord);
	rb.setfName(fName);
	rb.setlName(lName);
	
	sct.setAttribute("beanRef",rb);     
	RequestDispatcher rd=req.getRequestDispatcher("Register2.html");
	rd.forward(req, res);
	
}
}
