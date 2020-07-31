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

@WebServlet("/PreviewQuiz")
public class PreviewQuiz extends HttpServlet{
	public static List <Questions> questionsList = new ArrayList<Questions>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String subject = request.getParameter("Subject");
		String topic = request.getParameter("Topic");
		Questions q = new Questions();
		SQLStatement sql = new SQLStatement();
		questionsList = sql.FetchQuestions(subject, topic);
		 int sz = questionsList.size();
		 
		 response.setContentType("text/html");
	     PrintWriter out = response.getWriter();
	      
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      out.println(docType +
	    		 
	    			         "<html>\n"+
	    			    	  "<div class=\"container-login100\" style=\"background-image: url('images/bg-02.jpg');\">"+
	    			    	  "<!-- Basic -->\r\n" + 
	    			    	  "    <meta charset=\"utf-8\">\r\n" + 
	    			    	  "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">   \r\n" + 
	    			    	  "   \r\n" + 
	    			    	  "    <!-- Mobile Metas -->\r\n" + 
	    			    	  "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
	    			    	  " \r\n" + 
	    			    	  "     <!-- Site Metas -->\r\n" + 
	    			    	  "    <title>VidyaMitra -Preview Quiz</title>  \r\n" + 
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
	    			    	  "\r\n" + 
	    			    	  "</head>\r\n" + 
	    			    	  "<body class=\"host_version\"> \r\n" + 
	    			    	  "\r\n" + 
	    			    	  
	    			    	  "	\r\n" + 
	    			    	  "	\r\n" + 
	    			    	  "	<!-- Start header -->\r\n" + 
	    			    	  "			<header class=\"top-navbar\">\r\n" + 
	    			    	  "		<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n" + 
	    			    	  "			<div class=\"container-fluid\">\r\n" + 
	    			    	  "				<a class=\"navbar-brand\" href=\"Login.jsp\">\r\n" + 
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
	    			    	  "						<li class=\"nav-item\"><a class=\"nav-link\" href='/VidyaMitra/TeacherHome'>Home</a></li>\r\n" + 
	    			    	  "						\r\n" + 
	    			    	  "					</ul>\r\n" + 
	    			    	  "					<ul class=\"nav navbar-nav navbar-right\">\r\n" + 
	    			    	  "                        <li><a class=\"hover-btn-new log orange\" href=\"Login.jsp\" data-toggle=\"modal\" data-target=\"#login\"><span>Log Out</span></a></li>\r\n" + 
	    			    	  "                    </ul>\r\n" + 
	    			    	  "				</div>\r\n" + 
	    			    	  "			</div>\r\n" + 
	    			    	  "		</nav>\r\n" + 
	    			    	  "	</header>\r\n" + 
	    			    	  "	<!-- End header -->"+
	    			    	  "<div align=\"center\"><label for='option-11' style=' padding: 5px; font-size: 3.5rem;'>Preview Quiz</label></div>");
	           
	            for(int i=0;i<sz;i++){
	            	q = questionsList.get(i);
	            	//id = i+1;
	            out.println("<div id='block-11' style='padding: 10px;'>"
	            		+ "<div name='radiogroup'"+q.getId()+"><label for='option-11' style=' padding: 5px; font-size: 2.0rem;'>Question: "
	            		+q.getQuestionBody()+"</label></br></br>"+
	            	"<input type='radio' style='transform: scale(1.6); margin-right: 10px; vertical-align: middle; margin-top: -2px;' name='"+q.getId()+"' value='" + q.getChoice1()+"'><label for='option-11' style=' padding: 5px; font-size: 1.5rem;'>"+q.getChoice1()+"</label></br>"+
	            	"<input type='radio' style='transform: scale(1.6); margin-right: 10px; vertical-align: middle; margin-top: -2px;' name='"+q.getId()+"' value='" + q.getChoice2()+"'><label for='option-11' style=' padding: 5px; font-size: 1.5rem;'>"+q.getChoice2()+"</label></br>"+
	            	"<input type='radio' style='transform: scale(1.6); margin-right: 10px; vertical-align: middle; margin-top: -2px;' name='"+q.getId()+"' value='" + q.getChoice3()+"'><label for='option-11' style=' padding: 5px; font-size: 1.5rem;'>"+q.getChoice3()+"</label>"+
	            		"</div></div><hr/>");
	            }
	           
	      out.println("</div></body>"+
	         "</html>");
	     
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
	}
}
