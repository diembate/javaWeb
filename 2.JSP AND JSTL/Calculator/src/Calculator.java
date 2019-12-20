import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculator", urlPatterns = "/calculate" )
public class Calculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float FirstOperand = Float.parseFloat(request.getParameter("FirstOperand"));
        float SecondOperand = Float.parseFloat(request.getParameter("SecondOperand"));
        float Addition = FirstOperand + SecondOperand;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>: FirstOperand" + FirstOperand + "</h1>");
        writer.println("<h1>: SecondOperand " + SecondOperand + "</h1>");
        writer.println("<h1>: Calculator" + Addition+ "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
