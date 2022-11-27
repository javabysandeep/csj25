import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/sendRedirect", loadOnStartup = 0)
public class SendRedirectController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if("abc".equalsIgnoreCase(username) && "abc".equalsIgnoreCase(password)){
            //success page
            //new http request created and no data is sent
           resp.sendRedirect("welcome");
        } else {
            //error page
            resp.sendRedirect("https://www.google.com");

        }

    }
}
