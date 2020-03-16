package addressbook;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;

 public class AddressBookServlet extends HttpServlet {
	
	public static final long serialVersionUID = 1L;
		
		DBCollection address = db.getCollection("addresses"); 
        public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        	
        	String firstName = request.getParameter("firstName");
        	String phone = request.getParameter("phone");
        	String surname = request.getParameter("surname");
        	String city = request.getParameter("city");
        	String country = request.getParameter("country");
        	
        	
        	//book.addEntry(firstName,phone ,surname ,city ,country);  
        	AddressBook book = new AddressBookMongo();
    		BasicDBObject doc = new BasicDBObject ("firstName", firstName)
    				.append("surname", surname)
    				.append("phone", phone)
    				.append("country", country)
    				.append("city", city);
    		System.out.println(doc);	
    		 address.insert(doc);
    
        	response.getWriter().println("Added " + country +"Added " + phone +"Added " + surname +"Added " + firstName + ", there are now " + book.size() + "entries" );
        }
}
