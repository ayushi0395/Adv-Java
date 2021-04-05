import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class ServerDemo6 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		PrintWriter out=response.getWriter();
		out.println("<html>");
	    out.println("<head>");
	    out.println("<link rel='stylesheet' href='abc.css'>");
	    out.println("</head>");
		out.println("<body><div id='mymenu'><ul><li><a href='insert.html'>INSERT</a></li><li><a href='search.html'>SEARCH</a></li><li><a href='update.html'>UPDATE</a></li><li><a href='delete.html'>DELETE</a></li><li><a href='show.html'>SHOWALL</a></li><li><a href='logout.html'>LOGOUT</a></li> </ul></div></body>");
		try
		{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java?allowPublicKeyRetrieval=true&useSSL=false","root","@yushi09");
          Statement st=con.createStatement();  
			String q="select * from  marks";
			ResultSet re=st.executeQuery(q);
			out.println("<center>");
			out.println("<table cellpadding='12px'>");
			while(re.next())
			{
				out.println("<tr>");
				out.println("<td>"+re.getString(1)+"</td>");
				out.println("<td>"+re.getString(2)+"</td>");
				out.println("<td>"+re.getString(3)+"</td>");
				out.println("<td>"+re.getString(4)+"</td>");
				out.println("<td>"+re.getString(5)+"</td>");
				out.println("</tr>");
			}
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