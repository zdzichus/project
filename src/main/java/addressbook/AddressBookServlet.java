package addressbook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




 public class AddressBookServlet extends HttpServlet {
	
	public static final long serialVersionUID = 1L;
		AddressBook book = new AddressBookMongo();
		
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        	 response.setContentType("text/html; charset=UTF-8");
        	 
        	
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
        		            		              

        	   }         
        		         
 			         	   
       }     
        public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        	PrintWriter out = response.getWriter();
       	    response.setContentType("text/html; charset=UTF-8");
            try {
        	    out.println("<p> Wsztskie wpisy " + (book.readAllEntry()) + ")</p>");
                      
        
        }finally {out.close();
        }
        RequestDispatcher req = request.getRequestDispatcher("displayForm.jsp");
        req.forward(request, response);
        System.out.print( book.readEntry());	 
        }
        	   
        	   
 }    	

 
