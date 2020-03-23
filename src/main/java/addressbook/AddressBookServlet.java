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
	boolean empty_form;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
	
		String table_name = "PERSON";
		String surname = request.getParameter("surname");
		String phone = request.getParameter("phone");
		String firstName = request.getParameter("firstName");
		String city = request.getParameter("city");
		String country = request.getParameter("country");
		String select = request.getParameter("gender");

		if (surname.isEmpty() || phone.isEmpty() || firstName.isEmpty() || city.isEmpty() || country.isEmpty()) {
			empty_form = true;
			RequestDispatcher req = request.getRequestDispatcher("index.jsp");
			req.include(request, response);
			

		} else {
			empty_form = false;
			String[] myStringArray = new String[] { request.getParameter("surname"), request.getParameter("firstName"),
					request.getParameter("phone"), request.getParameter("city"), request.getParameter("country"),
					request.getParameter("gender") };
			book.addEntry(table_name, myStringArray);
            out.println("<!DOCTYPE html>");
			out.println("<html><head>");
			out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
			out.println("<link rel='stylesheet' type='text/css' href='style.css'>");
			out.println("<title>Dzidek1</title></head>");
			out.println("<body><h1>Database results:</h1>");
			out.println("<h2> there are now " + book.size() + "entries</h1><br>");
            out.println("<p> Wsztskie wpisy " + book.readAllEntry() + "<br>");
            
        	out.println("</body></html>");
			out.close();
			
		}
		if (empty_form == false) {
			
				      String string = book.readAllEntry(); 
				      String word = "\"Male\""; 
				      String temp[] = string.split("'"); 
				      int count = 0; 
						
				      for (int i = 0; i < temp.length; i++) { 
				         if (word.equals(temp[i]))  
				         count++; 
				      } 
				      System.out.println("The string is: " + string);
				      System.out.println("The word " + word + " occurs " + count + " times in the above string"); 
				   } 
		}
	
		
}

	


