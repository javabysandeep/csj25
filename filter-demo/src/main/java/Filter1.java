import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.time.LocalDateTime;

@WebFilter(filterName = "filter1", urlPatterns = {"/servlet1","/servlet2"})
public class Filter1 implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        response.getWriter().println("filter1");
        chain.doFilter(request,response);
    }

    public void destroy() {

    }
}
