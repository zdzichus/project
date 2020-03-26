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
					request.getParameter("phone"), request.getParameter("city"), request.getParameter("gender"),
					request.getParameter("country") };
			 book.addEntry(table_name, myStringArray);

		}
		if (empty_form == false) {
			
			String string = book.readAllEntry();
			String wordMale = "\"Male\"";
			String tempMale[] = string.split(" ");
			int countMale = 0;

			//String stringFemale = book.readAllEntry();
			String wordFemale = "\"Female\"";
			String tempFemale[] = string.split(" ");
			int countFemale = 0;

			for (int i = 0; i < tempMale.length; i++) {
				if (wordMale.equals(tempMale[i]))
					countMale++;
			}
			for (int i = 0; i < tempFemale.length; i++) {
				if (wordFemale.equals(tempFemale[i]))
					countFemale++;
			}
				out.println("<!DOCTYPE html>");
				out.println("<html><head>");
				out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
				out.println("<link rel='stylesheet' type='text/css' href='style.css'>");
				out.println("<title>Dzidek1</title></head>");
				out.println("<body><h1>Database results:</h1>");
				out.println("<h2> There are now: " + book.size() + " entries.<br> Male: "+ countMale +" Females: " +countFemale +"</h1> <br>");
				out.println("<table>");
				
				//String stringTable = book.readAllEntry();
				String wordTable = "\"\"";
				String tempTable[] = string.split("\"");
				int countTable = 0;
				for (int i = 0; i < tempTable.length; i++) {
					if (wordTable.equals(tempTable[i]))
						countTable++;		
					}
				    int z= 0; 
					for (int j=0; j< book.size(); j++) {
						
					out.println("<tr><td>"+tempTable[z+9]+"</td> <td>"+tempTable[z+11]+"</td> <td>"+tempTable[z+13]+"</td> <td>"+
					tempTable[z+15]+"</td><td>"+tempTable[z+17]+"</td> <td>"+tempTable[z+19]+"</td> <td>"+tempTable[z+5]+"</td></tr>");
			          
						z=z+20;
			          }
					out.println("</table>");
		   			out.println("</body></html>");
			        out.close();
		}
	}

}
