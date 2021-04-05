import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class ServerDemo4 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		String s1=request.getParameter("un");
		String s2=request.getParameter("up");		
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		try
		{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java?allowPublicKeyRetrieval=true&useSSL=false","root","@yushi09");
          Statement st=con.createStatement();
			String q="select * from register where NAME='"+s1+"' AND PASS='"+s2+"'";
			ResultSet re =st.executeQuery(q);
			if(re.next())
			{
			   response.sendRedirect("menu.html");	
			}
			else
			{
				out.println("invalid");
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