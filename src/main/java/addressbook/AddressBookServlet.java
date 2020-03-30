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
				out.println("<html><head><meta charset=\"UTF-8\">\r\n" + 
						"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
						"<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n" + 
						"<link rel=\"stylesheet\"\r\n" + 
						"	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\r\n" + 
						"	integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\"\r\n" + 
						"	crossorigin=\"anonymous\">\r\n" + 
						"<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"\r\n" + 
						"	integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\"\r\n" + 
						"	crossorigin=\"anonymous\"></script>\r\n" + 
						"<script\r\n" + 
						"	src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"\r\n" + 
						"	integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\"\r\n" + 
						"	crossorigin=\"anonymous\"></script>\r\n" + 
						"<script\r\n" + 
						"	src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"\r\n" + 
						"	integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\"\r\n" + 
						"	crossorigin=\"anonymous\"></script>\r\n" + 
						"<title>Application results </title></head>");
				out.println("<body><div class=\"navbar navbar-expand-lg fixed-top navbar-dark bg-primary\">\r\n" + 
						"		<div class=\"container\">\r\n" + 
						"			<a class=\"navbar-brand\" href=\"../\">Application</a>\r\n" + 
						"			<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n" + 
						"				data-target=\"#navbarColor01\" aria-controls=\"navbarColor01\"\r\n" + 
						"				aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n" + 
						"				<span class=\"navbar-toggler-icon\"></span>\r\n" + 
						"			</button>\r\n" + 
						"\r\n" + 
						"			<div class=\"collapse navbar-collapse\" id=\"navbarColor01\">\r\n" + 
						"				<ul class=\"navbar-nav mr-auto\">\r\n" + 
						"					<li class=\"nav-item active\"><a class=\"nav-link\" href=\"#\">Home\r\n" + 
						"							<span class=\"sr-only\">(current)</span>\r\n" + 
						"					</a></li>\r\n" + 
						"					<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Features</a>\r\n" + 
						"					</li>\r\n" + 
						"					<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Pricing</a>\r\n" + 
						"					</li>\r\n" + 
						"					<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">About</a></li>\r\n" + 
						"				</ul>\r\n" + 
						"				<form class=\"form-inline my-2 my-lg-0\">\r\n" + 
						"					<input class=\"form-control mr-sm-2\" type=\"text\"\r\n" + 
						"						placeholder=\"Search\">\r\n" + 
						"					<button class=\"btn btn-secondary my-2 my-sm-0\" type=\"submit\">Search</button>\r\n" + 
						"				</form>\r\n" + 
						"			</div>\r\n" + 
						"			\r\n" + 
						"		</div>\r\n" + 
						"	</div>");
				//out.println("<h2> There are now: " + book.size() + " entries.<br> Male: "+ countMale +" Females: " +countFemale +"</h1> <br>");
				out.println("<div class=\"container\">\r\n" + 
						"\r\n" + 
						"		<div class=\"row\">\r\n" + 
					
						
						"					<div class=\"card-header\">Databeses entries : " + book.size() + "<br> Males : "+countMale+"<br> Females :" +countFemale +" </div>\r\n" + 
						"					<div class=\"card-body\">\r\n" + 
					
						"  <table class=\"table table-hover\">\r\n" + 
						"  <thead>\r\n" + 
						"    <tr>\r\n" + 
						"      <th scope=\"col\">Name</th>\r\n" + 
						"      <th scope=\"col\">Surname</th>\r\n" + 
						"      <th scope=\"col\">Phone</th>\r\n" + 
						"      <th scope=\"col\">City</th>\r\n" + 
						"      <th scope=\"col\">Gender</th>\r\n" + 
						"      <th scope=\"col\">Country</th>\r\n" + 
						"      <th scope=\"col\">ID</th>\r\n" + 
						"    </tr>\r\n" + 
						"  </thead>\r\n" + 
						"  <tbody>\r\n" );
				
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
						
					out.println("    <tr class=\"table-active\">\r\n" + 
		   					"      <td>"+tempTable[z+9]+"</td>\r\n" + 
		   					"      <td>"+tempTable[z+11]+"</td>\r\n" + 
		   					"      <td>"+tempTable[z+13]+"</td>\r\n" + 
		   					"      <td>"+tempTable[z+15]+"</td>\r\n" + 
		   					"      <td>"+tempTable[z+17]+"</td>\r\n" + 
		   					"      <td>"+tempTable[z+19]+"</td>\r\n" + 
		   					"      <td>"+tempTable[z+5]+"</td>\r\n" + 
		   					"    </tr>\r\n"); 			          
						z=z+20;
			          }
					out.println("</tbody>\r\n" + "</table></div></div></div>");
		   			out.println("</body></html>");
			        out.close();
		}
	}

}
