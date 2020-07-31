package courseDesign;

import java.io.IOException;

 

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignUpValidation")

public class SignUpValidation extends HttpServlet {

       public SignUpValidation() {

               super();

           }

 

              protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {

                    

              }

             

              protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

                    

                     String uname = request.getParameter("uname");

                     String fname = request.getParameter("fname");

                     String surname = request.getParameter("surname");

                     String password = request.getParameter("password");

                     String role = request.getParameter("role");

                     

                     SQLStatement sql = new SQLStatement();

                     sql.AddUser(uname,fname,surname,password,role);
                     
                    request.setAttribute("Message", "**Signup successful. Please login with your credentials.");
                    RequestDispatcher reqD = request.getRequestDispatcher("Login.jsp");
     				reqD.include(request, response);

              }

 

}

 