package empresa;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class baseDatosServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		String email  = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		
	}
}
