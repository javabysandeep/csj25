import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if("abc".equalsIgnoreCase(username) && "abc".equalsIgnoreCase(password)){
            //success page
            RequestDispatcher welcome = req.getRequestDispatcher("welcome");
            welcome.forward(req,resp);
        } else {
            //error page
            RequestDispatcher error = req.getRequestDispatcher("login.html");
            resp.getWriter().println("Invalid credentials");
            error.include(req,resp);
        }

    }
}
