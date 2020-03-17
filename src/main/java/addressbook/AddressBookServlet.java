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
        	request.getParameter("phone");
        	String surname = request.getParameter("surname");
        	request.getParameter("city");
        	request.getParameter("country");
        	
        	String[] myStringArray = new String[] { "phone", "surname", "city","country" };
        	
        	book.addEntry(firstName, myStringArray); 
        	
      
    
        	response.getWriter().println("Added " + firstName + ", there are now " + book.size() + "entries" );
        	response.getWriter().println("Added " + surname + ", there are now " + book.size() + "entries" );
        	
        	
        }
}