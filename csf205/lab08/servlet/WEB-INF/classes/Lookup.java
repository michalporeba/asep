import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.nio.file.Files;
import java.nio.file.Paths;

@WebServlet("/Lookup")
public class Lookup extends HttpServlet {
    public void doGet(
        HttpServletRequest request,
        HttpServletResponse response
      )
    throws IOException, ServletException 
    {
        ServletContext context = getServletContext();
        String content = Files.readString(Paths.get(context.getRealPath("/students.xml")));

        PrintWriter out = response.getWriter();
        out.println(content);
    }
}
