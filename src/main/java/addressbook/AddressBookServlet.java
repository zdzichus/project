package addressbook;

import java.awt.Cursor;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

 public class AddressBookServlet extends HttpServlet {
	
	public static final long serialVersionUID = 1L;
		AddressBook book = new AddressBookMongo();
		
      
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         	
         	String person_table ="PERSON";
        	String surname = request.getParameter("surname");
        	String phone = request.getParameter("phone");
        	String firstName = request.getParameter("firstName");
        	String city = request.getParameter("city");
        	String country = request.getParameter("country");
        	String select = request.getParameter("gender"); 
        	   if (surname.isEmpty() || phone.isEmpty() || firstName.isEmpty() ||
        		   city.isEmpty() || country.isEmpty() )  
        	   {
        		   RequestDispatcher req = request.getRequestDispatcher("index.jsp");
       			   req.include(request, response);
        	   }
        	   else
        	   {
        		  
        		   String[] myStringArray = new String[] 
        		            { 
        		              request.getParameter("surname"),		
        		              request.getParameter("firstName"), 
        		              request.getParameter("phone"), 
        		              request.getParameter("city"),
        		              request.getParameter("country"),
        		              request.getParameter("gender")}; 
        		           book.addEntry(person_table, myStringArray);
        		   
        		           RequestDispatcher req = request.getRequestDispatcher("displayForm.jsp");
        		           req.forward(request, response);
       			       			       
       		             System.out.print(person_table);
 			             System.out.print(myStringArray[2]);
 			             
 			          	} 
        	     
			     }
            
                 	   
		private static void setUpTestData(DBCollection AddressBookMongo) {
		    for (int i=1; i <= 10; i++) {
		    	AddressBookMongo.insert(new BasicDBObject().append("employeeId", i).append("employeeName", "TestEmployee_"+i));
		    }
		}
		
 


 }
	
        
        