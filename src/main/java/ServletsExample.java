import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet("/firstApp")
public class ServletsExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple", 1));
        products.add(new Product("PineApple", 2));
        products.add(new Product("Watermelon", 5));
        System.out.println(products);
        resp.getWriter().println(products);
    }
}
