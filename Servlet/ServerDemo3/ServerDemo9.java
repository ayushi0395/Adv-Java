import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class ServerDemo9 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		String s1=request.getParameter("u1");
		String s2=request.getParameter("u2");
		String s3=request.getParameter("u3");
		String s4=request.getParameter("u4");
		String s5=request.getParameter("u5");
	
		PrintWriter out=response.getWriter();
		out.println("<html>");
	    out.println("<head>");
	    out.println("<link rel='stylesheet' href='abc.css'>");
	    out.println("</head>");
		out.println("<body><div id='mymenu'><ul><li><a href='insert.html'>INSERT</a></li><li><a href='search.html'>SEARCH</a></li><li>UPDATE</li><li>DELETE</li><li>SHOWALL</li><li>LOGOUT</li> </ul></div></body>");
		try
		{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java?allowPublicKeyRetrieval=true&useSSL=false","root","@yushi09");
          Statement st=con.createStatement();
		  String q="update marks set UName='"+s2+"',UPhy='"+s3+"',Uchem='"+s4+"',Umaths='"+s5+"' WHERE Uroll='"+s1+"'";
	      st.executeUpdate(q);
            out.println("<center>");
			out.println("<table cellpadding='12px'>");  
            
			out.println("DATA UPDATED !");
			out.println("</table>");
			out.println("</center>");
			con.close();
		}
		catch(Exception e1)
		{
			out.println(e1);
		}
		out.println("</body>");
		out.println("</html>");
	}
}