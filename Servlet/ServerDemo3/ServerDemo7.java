import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class ServerDemo7 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		String s1=request.getParameter("u1");
		
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
			String q="select * from marks WHERE UROLL='"+s1+"'";
			 ResultSet re = st.executeQuery(q);
              out.println("<center>");
			out.println("<table cellpadding='12px'>");  
               if(re.next())
			{
				out.println("<tr>");
				out.println("<td>Roll = "+re.getString(1)+"</td>");
				out.println("<td> NAME = "+re.getString(2)+"</td>");
				out.println("<td>PHY = "+re.getString(3)+"</td>");
				out.println("<td> CHEM = "+re.getString(4)+"</td>");
				out.println("<td> MATHS = "+re.getString(5)+"</td>");
				out.println("</tr>");
				out.println("</table>");
			    out.println("</center>");
			}
			else{
				out.println(" <h1><font color=white>Sorry! Data Not  Found  For the Roll no. You Entered :( </font></h1>");
			    }
			
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