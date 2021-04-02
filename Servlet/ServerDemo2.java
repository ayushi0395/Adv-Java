import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
 public class ServerDemo2 extends HttpServlet
 {
      public void deGet(HttpServletResponse response,HttpServletRequest request) throws IOException,ServletException
      {
           String s1=request.getParameter("un");
           PrintWriter out =response.getWriter();
           out.println("<html>");
           out.println("<body>");
           out.println("<h1> Welcome=" +s1+"</h1>");
           out.println("</body>");
           out.println("</html>");
      }
 }