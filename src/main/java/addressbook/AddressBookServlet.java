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
		AddressBook book = new AddressBookMongo();
		DBCollection address = db.getCollection("addresses"); 
        public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        	
        	String firstName = request.getParameter("firstName").toString();
        	String phone = request.getParameter("phone").toString();
        	String surname = request.getParameter("surname").toString();
        	String city = request.getParameter("city").toString();
        	String country = request.getParameter("country").toString();
        	
        	
        	//book.addEntry(firstName,phone ,surname ,city ,country);  
    	
    		BasicDBObject doc = new BasicDBObject ("firstName", firstName)
    				.append("surname", surname)
    				.append("phone", phone)
    				.append("country", country)
    				.append("city", city);
    			
    		 address.insert(doc);
    
        	response.getWriter().println("Added " + country +"Added " + phone +"Added " + surname +"Added " + firstName + ", there are now " + book.size() + "entries" );
        }
}
