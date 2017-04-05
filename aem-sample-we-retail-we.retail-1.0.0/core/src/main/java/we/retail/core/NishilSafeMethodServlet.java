package we.retail.core;
import java.io.IOException;

import javax.servlet.ServletException;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;

@SlingServlet(paths = "/bin/nishil/repo", methods = "GET")
public class NishilSafeMethodServlet extends SlingSafeMethodsServlet {
    private static final long serialVersionUID = -3960692666512058118L;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)throws ServletException, IOException {
        response.setHeader("Content-Type", "application/json");
        response.getWriter().print("{\"coming\" : \"soon\"}");
    }
}