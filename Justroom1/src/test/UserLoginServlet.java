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
public class UserLoginServlet extends GenericServlet{
	public ServletContext sct;
	public void init(){
		sct=this.getServletContext();
				
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String uName=req.getParameter("uName");
		String pWord=req.getParameter("pWord");
		String submit="User";//User
		LoginDAO ld=new LoginDAO();
		boolean k= ld.validate(uName,pWord,submit,sct);
		if(k)
		{
			String fName=(String)sct.getAttribute("fName");
			
			pw.println("<h1><font color='red' >WELCOME :</font><h1>"+ fName);
			
			RequestDispatcher rd=req.getRequestDispatcher("AddRoom.html");
			rd.include(req, res);
		
			
		}
		else
		{
			pw.println("INVALID USER NAME OR PASSWARD");
			RequestDispatcher rd=req.getRequestDispatcher("Login.html");
					rd.include(req, res);
		}
		

		
	}

}
