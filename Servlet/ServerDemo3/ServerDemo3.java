import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class ServerDemo3 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		String s1=request.getParameter("un");
		String s2=request.getParameter("up");
		String s3=request.getParameter("ue");
		String s4=request.getParameter("ud");
		String s5=request.getParameter("ub");
		String s6=request.getParameter("uy");

		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		try
		{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java?useSSL=false","root","@yushi09");
          Statement st=con.createStatement();
			String q="insert into  register values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"')";
			st.executeUpdate(q);
			out.println("<h1>Data Insert </h1>");
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