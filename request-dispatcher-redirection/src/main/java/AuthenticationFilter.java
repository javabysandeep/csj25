import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "AuthenticationFilter", urlPatterns = {"/login","/welcome"})
public class AuthenticationFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if("abc".equalsIgnoreCase(username) && "abc".equalsIgnoreCase(password)){
            // request os given to the next available filter and if
            //filter is not available then request will be given to the servlet
            chain.doFilter(request,response);
        }
        response.getWriter().println("Invalid credentials returning from filter");

    }


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
