import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie")
public class CookieController  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        if(cookies==null){
            String productName = req.getParameter("productName");
            Cookie cookie = new Cookie("productName",productName);
            cookie.setMaxAge(365*24*60*60);
            resp.addCookie(cookie);
            resp.getWriter().println("Cookie set in the browser");
        } else {
            for (Cookie cookie :cookies) {
                resp.getWriter().println("Cookie Name "+cookie.getName());
                resp.getWriter().println("Cookie Value "+cookie.getValue());
            }
        }
    }
}
