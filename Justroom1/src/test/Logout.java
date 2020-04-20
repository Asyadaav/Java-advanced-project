package test;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class Logout extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{

	RequestDispatcher rd=req.getRequestDispatcher("Login.html");
	rd.include(req, res);
	}
}
