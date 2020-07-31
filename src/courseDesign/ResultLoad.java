package courseDesign;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class StudentHomeLoad
 */
@WebServlet("/ResultLoad")
public class ResultLoad extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List <Results> resultList = new ArrayList<Results>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResultLoad() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession(false);  
        
        String username=(String)session.getAttribute("username");
		SQLStatement sq = new SQLStatement();
		
		resultList=sq.FetchResults(username);
		response.setContentType("text/html");
	     PrintWriter out = response.getWriter();
	     String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      out.println(docType +
	    		  "<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"\r\n" + 
	    		  "    pageEncoding=\"ISO-8859-1\"%>\r\n" + 
	    		  "     <%@ taglib uri=\"http://java.sun.com/jsp/jstl/core\" prefix=\"c\" %>  \r\n" + 
	    		  "<!DOCTYPE html>\r\n" + 
	    		  "<html lang=\"en\">\r\n" + 
	    		  "\r\n" + 
	    		  "    <!-- Basic -->\r\n" + 
	    		  "    <meta charset=\"utf-8\">\r\n" + 
	    		  "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">   \r\n" + 
	    		  "   \r\n" + 
	    		  "    <!-- Mobile Metas -->\r\n" + 
	    		  "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
	    		  " \r\n" + 
	    		  "     <!-- Site Metas -->\r\n" + 
	    		  "    <title>VidyaMitra -Your Result</title>  \r\n" + 
	    		  "    <meta name=\"keywords\" content=\"\">\r\n" + 
	    		  "    <meta name=\"description\" content=\"\">\r\n" + 
	    		  "    <meta name=\"author\" content=\"\">\r\n" + 
	    		  "\r\n" + 
	    		  "    <!-- Site Icons -->\r\n" + 
	    		  "    <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\" />\r\n" + 
	    		  "    <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\r\n" + 
	    		  "\r\n" + 
	    		  "    <!-- Bootstrap CSS -->\r\n" + 
	    		  "    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n" + 
	    		  "    <!-- Site CSS -->\r\n" + 
	    		  "    <link rel=\"stylesheet\" href=\"style.css\">\r\n" + 
	    		  "    <!-- ALL VERSION CSS -->\r\n" + 
	    		  "    <link rel=\"stylesheet\" href=\"css/versions.css\">\r\n" + 
	    		  "    <!-- Responsive CSS -->\r\n" + 
	    		  "    <link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n" + 
	    		  "    <!-- Custom CSS -->\r\n" + 
	    		  "    <link rel=\"stylesheet\" href=\"css/custom.css\">\r\n" + 
	    		  "\r\n" + 
	    		  "    <!-- Modernizer for Portfolio -->\r\n" + 
	    		  "    <script src=\"js/modernizer.js\"></script>\r\n" + 
	    		  "\r\n" + 
	    		  "    <!--[if lt IE 9]>\r\n" + 
	    		  "      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n" + 
	    		  "      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n" + 
	    		  "    <![endif]-->\r\n" + 
	    		  "    <style>\r\n" + 
	    		  ".container {\r\n" + 
	    		  "  height: 100px;\r\n" + 
	    		  "}\r\n" + 
	    		  "#resultscss {\r\n" + 
	    		  "  font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n" + 
	    		  "  border-collapse: collapse;\r\n" + 
	    		  "  width: 100%;\r\n" + 
	    		  "}\r\n" + 
	    		  "\r\n" + 
	    		  "#resultscss td, #customers th {\r\n" + 
	    		  "  border: 1px solid #ddd;\r\n" + 
	    		  "  padding: 8px;\r\n" + 
	    		  "}\r\n" + 
	    		  "\r\n" + 
	    		  "#resultscss tr:nth-child(even){background-color: #f2f2f2;}\r\n" + 
	    		  "\r\n" + 
	    		  "#resultscss tr:hover {background-color: #ddd;}\r\n" + 
	    		  "\r\n" + 
	    		  "#resultscss th {\r\n" + 
	    		  "  padding-top: 12px;\r\n" + 
	    		  "  padding-bottom: 12px;\r\n" + 
	    		  "  text-align: left;\r\n" + 
	    		  "  background-color: #4CAF50;\r\n" + 
	    		  "  color: white;\r\n" + 
	    		  "}\r\n" + 
	    		  "</style>\r\n" + 
	    		  "\r\n" + 
	    		  "</head>\r\n" + 
	    		  "<body class=\"host_version\">\r\n" + 
	    		  "\r\n" + 
	    		  "    \r\n" + 
	    		  "	<!-- Start header -->\r\n" + 
	    		  "			<header class=\"top-navbar\">\r\n" + 
	    		  "		<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n" + 
	    		  "			<div class=\"container-fluid\">\r\n" + 
	    		  "				<a class=\"navbar-brand\" href=\"index.html\">\r\n" + 
	    		  "					<img src=\"images/logo.png\" alt=\"\" />\r\n" + 
	    		  "				</a>\r\n" + 
	    		  "				<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbars-host\" aria-controls=\"navbars-rs-food\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n" + 
	    		  "					<span class=\"icon-bar\"></span>\r\n" + 
	    		  "                    <span class=\"icon-bar\"></span>\r\n" + 
	    		  "                    <span class=\"icon-bar\"></span>\r\n" + 
	    		  "				</button>\r\n" + 
	    		  "				<div class=\"collapse navbar-collapse\" id=\"navbars-host\">\r\n" + 
	    		  "					<ul class=\"navbar-nav ml-auto\">\r\n" + 
	    		  "						\r\n" + 
	    		  "						<li class=\"nav-item\"><a class=\"nav-link\" href=\"/VidyaMitra/StudentHomeLoad\">Home</a></li>\r\n" + 
	    		  "						\r\n" + 
	    		  "					</ul>\r\n" + 
	    		  "					<ul class=\"nav navbar-nav navbar-right\">\r\n" + 
	    		  "                        <li><a class=\"hover-btn-new log orange\" href=\"Login.jsp\" data-toggle=\"modal\" data-target=\"#login\"><span>Log Out</span></a></li>\r\n" + 
	    		  "                    </ul>\r\n" + 
	    		  "				</div>\r\n" + 
	    		  "			</div>\r\n" + 
	    		  "		</nav>\r\n" + 
	    		  "	</header>\r\n" + 
	    		  "	<!-- End header -->\r\n" + 
	    		  "	\r\n" + 
	    		  "	<div class=\"container\" style=\"background-image: url('images/bg-02.jpg');\">\r\n" + 
	    		  "	<div class=\"vertical-center\" style=\"background-image: url('images/bg-02.jpg');\" align=\"justify\">\r\n" + 
	    		  "	<table id=\"resultscss\">\r\n" + 
	    		  "	<tr><th>Subject</th><th>Topic</th><th>Score</th><th>Out Of</th><th>Attempt Date</th>\r\n" );
	    		  for(int i=0;i<resultList.size();i++) {
	    			  Results r = new Results();
	    			  r=resultList.get(i);
	    			  out.println("<tr><td>"+r.getSubject()+"</td><td>"+r.getTopic()+"</td><td>"+r.getScore()+"</td><td>"+r.getTotalScore()+"</td><td>"+r.getAttemptDate()+"</td></tr>");
	    		  }

	    		  out.println("	</table>\r\n" + 
	    		  "	\r\n" + 
	    		  "	</div></div>\r\n" + 
	    		  "    </body></html>\r\n" + 
	    		  "    \r\n" + 
	    		  "");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
