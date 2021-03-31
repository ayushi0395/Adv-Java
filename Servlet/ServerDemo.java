import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServerDemo extends HttpServlet
{
	public void doGet(HttpServletRequest request ,HttpServletResponse response) throws IOException,ServletException 
     {
     	PrintWriter out=response.getWriter();
     	out.println("<html>");
     	out.println("<h1> set indore </h1>");
     	out.println("</html>");
     }
}