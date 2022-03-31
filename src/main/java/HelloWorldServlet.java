import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String outputResp = "<h1>Hello, World!</h1>";

        if(request.getParameter("name") != null) {
            outputResp = "<h1> Hello " + request.getParameter("name") + "!</h1>";
        }

        PrintWriter out = response.getWriter();
        out.println(outputResp);

    }
}
