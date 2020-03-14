package addressbook;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class AddressBookServlet extends HttpServlet {
	
	public static final long serialVersionUID = 1L;
		AddressBook book = new AddressBookMongo();
         
        public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        	
        	String firstName = request.getParameter("firstName");
        	String phone = request.getParameter("phone");
        	
        	book.addEntry(firstName, phone);   	
    
        	response.getWriter().println("Added " + firstName + ", there are now " + book.size() + "entries" );
        }
}
