package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;

public class LoginDAO 
{
	public boolean z;
	public boolean validate(String uName, String pWord,String name,ServletContext sct)
	{
		try
		{
			Connection con=DBConnection.getCon();
					if(name.equals("User"))
					{
						PreparedStatement ps=con.prepareStatement("select * from UserReg2 where UNAME=? AND PWORD=?");
						ps.setString(1,uName);
						ps.setString(2,pWord );
						ResultSet rs= ps.executeQuery();
						if(rs.next())
						{
							z=true;
							sct.setAttribute("fName", rs.getString(3));
						
					    }
					}
					else
					{
							PreparedStatement ps1=con.prepareStatement("select * from Admin2 where UNAME=? and PWORD=?");
						    ps1.setString(1,uName);
						     ps1.setString(2,pWord );
						     ResultSet rs1= ps1.executeQuery();
						   if(rs1.next())
						    {
							z=true;
							sct.setAttribute("fName", rs1.getString(3));
						
					        }
						
					
					  }
					
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return z;
		
		
	}
	

}
