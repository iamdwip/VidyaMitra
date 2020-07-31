package courseDesign;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/SignInValidation")
public class SignInValidation extends HttpServlet {
	 public SignInValidation() {
	        super();
	    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			
			String name = request.getParameter("username");
			String password = request.getParameter("pass");
			String role = request.getParameter("UserRole");
			//System.out.println(role);
			SQLStatement sql = new SQLStatement();
			String valid = sql.VerifyLogin(name, password, role);
			if (valid.equalsIgnoreCase("teacher"))
			{
				//System.out.println(role);
				HttpSession session=request.getSession();  
		        session.setAttribute("username",name);
				RequestDispatcher reqD = request.getRequestDispatcher("TeacherHome");
				reqD.include(request, response);
			}
			else if(valid.equalsIgnoreCase("student"))
			{
				HttpSession session=request.getSession();  
		        session.setAttribute("username",name);
				RequestDispatcher reqD = request.getRequestDispatcher("StudentHomeLoad");
				reqD.forward(request, response);
			}else {
				request.setAttribute("Message", "**Invalid login credentials.");
				RequestDispatcher reqD = request.getRequestDispatcher("/Login.jsp");
				reqD.forward(request, response);
			}	

		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {  
			
		}  

		} 


