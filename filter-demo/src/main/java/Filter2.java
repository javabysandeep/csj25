import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "filter2", urlPatterns = {"/servlet1","/servlet2"})
public class Filter2 implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        response.getWriter().println("filter2");
        chain.doFilter(request,response);
    }

    public void destroy() {

    }
}
