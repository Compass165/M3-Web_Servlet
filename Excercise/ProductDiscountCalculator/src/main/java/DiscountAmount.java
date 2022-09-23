import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountAmount", value = "/calculator")
public class DiscountAmount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = String.copyValueOf(request.getParameter("productDescription").toCharArray());
        Float productPrice = Float.parseFloat(request.getParameter("productPrice"));
        Float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));

        float discountAmount = (float) (productPrice * discountPercent * 0.01);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Mô tả sản phẩm: " + productDescription + "</h1>");
        writer.println("<h1>Giá: " + productPrice + "</h1>");
        writer.println("<h1>Tỷ lệ phần trăm: " + discountPercent + "</h1>");
        writer.println("<h1>Giá thành sau chiết khấu: " + discountAmount + "</h1>");
        writer.println("</html>");
    }
}
