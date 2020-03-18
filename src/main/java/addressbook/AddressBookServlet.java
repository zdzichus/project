package addressbook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class AddressBookServlet extends HttpServlet {
	
	public static final long serialVersionUID = 1L;
		AddressBook book = new AddressBookMongo();
		
        public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         	
         	
        	String surname = request.getParameter("surname");
        	String phone = request.getParameter("phone");
        	String firstName = request.getParameter("firstName");
        	String city = request.getParameter("city");
        	String country = request.getParameter("country");
        	String select = request.getParameter("gender"); 
        	        	
        	String[] myStringArray = new String[] 
            { request.getParameter("firstName"), 
              request.getParameter("phone"), 
              request.getParameter("city"),
              request.getParameter("country"),
              request.getParameter("gender")}; 
              book.addEntry(surname, myStringArray); 
              PrintWriter out = response.getWriter();
          	 
          	  out.println(" Added " + select + ", Added " + surname + ", Added " + firstName + " Added " + phone + " Added " + city + " Added " + country +", there are now " + book.size() + " entries" );
              
        }    	
     
        
}