package addressbook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginBookServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String comp = request.getParameter("comp");
		String processor = request.getParameter("processor");
		String ram = request.getParameter("ram");
		String id = "id";
        
		LoginBook computer = new LoginBook();
		computer.setComp(comp);
		computer.setProcessor(processor);
		computer.setRam(ram);
		
		
		if (comp.isEmpty() || processor.isEmpty() || ram.isEmpty() ) {
			
			RequestDispatcher req = request.getRequestDispatcher("displayForm.jsp");
			req.include(request, response);

		} else {
			LoginBookMongo log = new LoginBookMongo();
							
			log.addRows(request.getParameter("processor"), request.getParameter("ram"));
			log.addRows(request.getParameter("comp"), null);
			out.println("wyniki :" + log.readAllComp()  + " " );     
	      	
			
		}
		

	}

}	 
