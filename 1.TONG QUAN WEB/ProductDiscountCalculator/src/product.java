import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "product",urlPatterns = "/convert")
public class product extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       float  ListPrice = Float.parseFloat(request.getParameter("Price"));
        float DiscountPercent= Float.parseFloat(request.getParameter("DiscountPercent"));

        float DiscountAmount = (float) (ListPrice /100 * DiscountPercent);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>ListPrice: " + ListPrice + "</h1>");
        writer.println("<h1>DiscountPercent: " + DiscountPercent + "</h1>");
        writer.println("<h1>DiscountAmount: " + DiscountAmount + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
