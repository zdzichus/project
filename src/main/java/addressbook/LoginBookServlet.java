package addressbook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginBookServlet extends HttpServlet {
	LoginBookMongo log = new LoginBookMongo();
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		 login = request.getParameter("login");
         password = request.getParameter("password");
		
		if (login.equals("admin") || password.equals("kwiatek33")) {
			
			RequestDispatcher req = request.getRequestDispatcher("form.jsp");
			System.out.println("jestem zalogowany");
			req.include(request, response);

		} else {
			       
			 RequestDispatcher req = request.getRequestDispatcher("login.jsp");
			 req.include(request, response);
		}
		

	}

}	 
