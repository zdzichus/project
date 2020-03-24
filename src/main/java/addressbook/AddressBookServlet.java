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
				
				//String stringTable = book.readAllEntry();
				String wordTable = "\"\"";
				String tempTable[] = string.split("\"");
				int countTable = 0;
				for (int i = 0; i < tempTable.length; i++) {
					if (wordTable.equals(tempTable[i]))
	   				countTable++;
    				out.println("<h2> All of word in  # "  +tempTable[i] +" #</h1> <br>");
				}
			   out.println("<h2> All of word sum '' : "  + countTable +"</h1> <br>");
			   out.println("<table>"+
			   "<tr><td>"+tempTable[5]+"</td> <td>"+tempTable[9]+"</td> <td>"+tempTable[11]+"</td> <td>"+tempTable[13]+"</td><td>"+tempTable[15]+"</td> <td>"+tempTable[17]+"</td> <td>"+tempTable[19]+"</td></tr>"+
			   "<tr><td>"+tempTable[25]+"</td> <td>"+tempTable[29]+"</td> <td>"+tempTable[31]+"</td> <td>"+tempTable[33]+"</td><td>"+tempTable[35]+"</td> <td>"+tempTable[37]+"</td> <td>"+tempTable[39]+"</td></tr>"+
			   "<tr><td>"+tempTable[45]+"</td> <td>"+tempTable[49]+"</td> <td>"+tempTable[51]+"</td> <td>"+tempTable[53]+"</td><td>"+tempTable[55]+"</td> <td>"+tempTable[57]+"</td> <td>"+tempTable[59]+"</td></tr>"+
			   "</table>");
			
			out.println("<p> Wsztskie wpisy " + book.readAllEntry() + "<br>");
			out.println("</body></html>");
			out.close();
		}
	}

}
