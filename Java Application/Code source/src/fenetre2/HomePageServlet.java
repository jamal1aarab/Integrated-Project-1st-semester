package fenetre2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePageServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // set the content type to HTML
    response.setContentType("text/html");

    // get the PrintWriter to write the HTML page
    PrintWriter out = response.getWriter();

    // write the HTML page
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Home Page</title>");
    out.println("<style>");
    out.println("#animated-element {");
    out.println("  animation: example 5s infinite;");
    out.println("}");
    out.println("@keyframes example {");
    out.println("  0%   {background-color:red;}");
    out.println("  25%  {background-color:yellow;}");
    out.println("  50%  {background-color:blue;}");
    out.println("  75%  {background-color:green;}");
    out.println("  100% {background-color:red;}");
    out.println("}");
    out.println("</style>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Welcome to the Home Page</h1>");
    out.println("<button onclick='alert(\"Button clicked!\")'>Click me</button>");
    out.println("<div id='animated-element'>This element has an animation</div>");
    out.println("</body>");
    out.println("</html>");
  }
}
