import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FourSub extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int i = Integer.parseInt(req.getParameter("sub1"));
		int j = Integer.parseInt(req.getParameter("sub2"));
		
		int k = i - j;
		
		PrintWriter out = res.getWriter();
		out.println("Subtraction is : " + k);
	}
}
